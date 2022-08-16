package pe.com.hotel.service;

import java.util.List;
import java.util.Optional;
import pe.com.hotel.entity.Rol;

public interface RolService {
    
    //Mostrar todo
    List<Rol> findAll();
    //Mostrar todos los habilitados
    List<Rol> findAllCustom();
    //buscar pòr nombre
    List<Rol> findbyName();
    //buscar pòr codigo
    Optional<Rol> findById(long id);
    //agregar
    Rol add(Rol ro);
    //actualizar
    Rol update(Rol ro);
    //eliminar
    Rol delete(Rol ro);
}
