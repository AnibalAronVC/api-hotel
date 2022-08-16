package pe.com.hotel.service;

import java.util.List;
import java.util.Optional;
import pe.com.hotel.entity.Reserva;

public interface ReservaService {
    
    //Mostrar todo
    List<Reserva> findAll();
    //Mostrar todos los habilitados
    List<Reserva> findAllCustom();
    //buscar pòr nombre
    List<Reserva> findbyName();
    //buscar pòr codigo
    Optional<Reserva> findById(long id); //error
    //agregar
    Reserva add(Reserva re);
    //actualizar
    Reserva update(Reserva re);
    //eliminar
    Reserva delete(Reserva re);
    
}
