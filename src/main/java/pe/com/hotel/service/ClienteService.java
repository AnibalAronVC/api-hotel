package pe.com.hotel.service;

import java.util.List;
import java.util.Optional;
import pe.com.hotel.entity.Cliente;

public interface ClienteService {
    
    //Mostrar todo
    List<Cliente> findAll();
    //Mostrar todos los habilitados
    List<Cliente> findAllCustom();
    //buscar pòr nombre
    List<Cliente> findbyName();
    //buscar pòr codigo
    Optional<Cliente> findById(long id);
    //agregar
    Cliente add(Cliente c);
    //actualizar
    Cliente update(Cliente c);
    //eliminar
    Cliente delete(Cliente c);
    
}
