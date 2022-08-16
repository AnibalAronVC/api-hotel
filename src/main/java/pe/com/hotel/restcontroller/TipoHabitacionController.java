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
import pe.com.hotel.entity.TipoHabitacion;
import pe.com.hotel.service.TipoHabitacionService;

@RestController
@RequestMapping("/tipo_habitacion")
public class TipoHabitacionController {
    
    @Autowired
    private TipoHabitacionService thabitacionService;
    
    @GetMapping
    public List<TipoHabitacion> findAll(){
        return thabitacionService.findAll();
    }
    @GetMapping("/custom")
    public List<TipoHabitacion> findAllCustom(){
        return thabitacionService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<TipoHabitacion> finById(@PathVariable Long id){
        return thabitacionService.findById(id);
    }
    @PostMapping
    public TipoHabitacion add(@RequestBody TipoHabitacion th){
        return thabitacionService.add(th);
    }  
    @PutMapping("/{id}")
    public TipoHabitacion update(@PathVariable Long id,@RequestBody TipoHabitacion th){
        th.setId_TipoHabit(id);
        return thabitacionService.update(th);
    }
    @DeleteMapping("/{id}")
    public TipoHabitacion delete(@PathVariable Long id){
        TipoHabitacion objthabitacion= new TipoHabitacion();
        objthabitacion.setId_TipoHabit(id);
        return thabitacionService.delete(objthabitacion);
    } 
    
}
