package pe.com.hotel.service;

import java.util.List;
import java.util.Optional;
import pe.com.hotel.entity.Habitacion;

public interface HabitacionService {
    
    //Mostrar todo
    List<Habitacion> findAll();
    //Mostrar todos los habilitados
    List<Habitacion> findAllCustom();
    //buscar pòr nombre
    List<Habitacion> findbyName();
    //buscar pòr codigo
    Optional<Habitacion> findById(long id);
    //agregar
    Habitacion add(Habitacion ha);
    //actualizar
    Habitacion update(Habitacion ha);
    //eliminar
    Habitacion delete(Habitacion ha);
}
