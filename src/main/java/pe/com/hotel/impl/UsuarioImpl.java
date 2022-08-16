package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.Usuario;
import pe.com.hotel.repository.UsuarioRepository;
import pe.com.hotel.service.UsuarioService;

@Service
public class UsuarioImpl implements UsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public List<Usuario> findAllCustom() {
        return usuarioRepository.findAllCustom();
    }

    @Override
    public List<Usuario> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Usuario> findById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario add(Usuario us) {
        return usuarioRepository.save(us);
    }

    @Override
    public Usuario update(Usuario us) {
        Usuario objusuario=usuarioRepository.getById(us.getId_usuario());
        BeanUtils.copyProperties(us, objusuario);
        return usuarioRepository.save(objusuario);
    }

    @Override
    public Usuario delete(Usuario us){
        Usuario objusuario=usuarioRepository.getById(us.getId_usuario());
        objusuario.setEstado(false);
        return usuarioRepository.save(objusuario);
    }
}
