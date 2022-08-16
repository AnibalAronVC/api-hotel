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
import pe.com.hotel.entity.Usuario;
import pe.com.hotel.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public List<Usuario> findAll(){
        return usuarioService.findAll();
    }
    @GetMapping("/custom")
    public List<Usuario> findAllCustom(){
        return usuarioService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Usuario> finById(@PathVariable Long id){
        return usuarioService.findById(id);
    }
    @PostMapping
    public Usuario add(@RequestBody Usuario us){
        return usuarioService.add(us);
    }  
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Long id,@RequestBody Usuario us){
        us.setId_usuario(id);
        return usuarioService.update(us);
    }
    @DeleteMapping("/{id}")
    public Usuario delete(@PathVariable Long id){
        Usuario objusuario= new Usuario();
        objusuario.setId_usuario(id);
        return usuarioService.delete(objusuario);
    }  
}
