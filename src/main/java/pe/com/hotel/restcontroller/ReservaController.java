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
import pe.com.hotel.entity.Reserva;
import pe.com.hotel.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;
    
    @GetMapping
    public List<Reserva> findAll(){
        return reservaService.findAll();
    }
    @GetMapping("/custom")
    public List<Reserva> findAllCustom(){
        return reservaService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Reserva> finById(@PathVariable Long id){
        return reservaService.findById(id);
    }
    @PostMapping
    public Reserva add(@RequestBody Reserva re){
        return reservaService.add(re);
    }  
    @PutMapping("/{id}")
    public Reserva update(@PathVariable Long id,@RequestBody Reserva re){
        re.setId_reserva(id);
        return reservaService.update(re);
    }
    @DeleteMapping("/{id}")
    public Reserva delete(@PathVariable Long id){
        Reserva objreserva= new Reserva();
        objreserva.setId_reserva(id);
        return reservaService.delete(objreserva);
    }  
    
}
