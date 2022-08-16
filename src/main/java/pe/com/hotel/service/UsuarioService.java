package pe.com.hotel.service;

import java.util.List;
import java.util.Optional;
import pe.com.hotel.entity.Usuario;

public interface UsuarioService {
    //Mostrar todo
    List<Usuario> findAll();
    //Mostrar todos los habilitados
    List<Usuario> findAllCustom();
    //buscar pòr nombre
    List<Usuario> findbyName();
    //buscar pòr codigo
    Optional<Usuario> findById(long id);
    //agregar
    Usuario add(Usuario us);
    //actualizar
    Usuario update(Usuario us);
    //eliminar
    Usuario delete(Usuario us);
}
