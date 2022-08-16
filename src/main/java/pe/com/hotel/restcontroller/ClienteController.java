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
import pe.com.hotel.entity.Cliente;
import pe.com.hotel.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return clienteService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Cliente> finById(@PathVariable Long id){
        return clienteService.findById(id);
    }
    @PostMapping
    public Cliente add(@RequestBody Cliente cl){
        return clienteService.add(cl);
    }  
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id,@RequestBody Cliente cl){
        cl.setCodigo(id);
        return clienteService.update(cl);
    }
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable Long id){
        Cliente objclientes= new Cliente();
        objclientes.setCodigo(id);
        return clienteService.delete(objclientes);
    }
}
