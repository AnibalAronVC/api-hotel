package pe.com.hotel.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.hotel.entity.Rol;
import pe.com.hotel.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolService rolService;
    
    @GetMapping
    public List<Rol> findAll(){
        return rolService.findAll();
    }
    @GetMapping("/custom")
    public List<Rol> findAllCustom(){
        return rolService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Rol> finById(@PathVariable Long id){
        return rolService.findById(id);
    }
    @PostMapping
    public Rol add(@RequestBody Rol ro){
        return rolService.add(ro);
    }  
    @PutMapping("/{id}")
    public Rol update(@PathVariable Long id,@RequestBody Rol ro){
        ro.setId_Rol(id);
        return rolService.update(ro);
    }
    @DeleteMapping("/{id}")
    public Rol delete(@PathVariable Long id){
        Rol objrol= new Rol();
        objrol.setId_Rol(id);
        return rolService.delete(objrol);
    }  
}
