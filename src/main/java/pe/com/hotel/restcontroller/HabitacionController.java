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
import pe.com.hotel.entity.Habitacion;
import pe.com.hotel.service.HabitacionService;

@RestController
//agregamos el nombre con el cual se va a buscar el controlador rest
@RequestMapping("/habitacion")

public class HabitacionController {
    
    @Autowired
    private HabitacionService habitacionService;
    
    //para poder obtener valores utilizamos la anotacion GetMapping
    @GetMapping
    public List<Habitacion> findAll(){
        return habitacionService.findAll();
    }        
    @GetMapping("/custom")
    public List<Habitacion> findAllCustom(){
        return habitacionService.findAllCustom();
    }  
    @GetMapping("/{id}")
    public Optional<Habitacion> findById(@PathVariable Long id){
        return habitacionService.findById(id);
    }  
    
    @PostMapping
    public Habitacion add(@RequestBody Habitacion ha){
        return habitacionService.add(ha);
    }  
    
    @PutMapping("/{id}")
    public Habitacion update(@PathVariable Long id,@RequestBody Habitacion ha){
        ha.setId_Habit(id);
        return habitacionService.update(ha);
    }  
    @DeleteMapping("/{id}")
    public Habitacion delete(@PathVariable Long id){
        Habitacion objHabitacion= new Habitacion();
        objHabitacion.setId_Habit(id);
        return habitacionService.delete(Habitacion.builder().id_Habit(id).build());
    } 
}
