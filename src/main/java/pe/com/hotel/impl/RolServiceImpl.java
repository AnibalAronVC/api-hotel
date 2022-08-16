package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.Rol;
import pe.com.hotel.repository.RolRepository;
import pe.com.hotel.service.RolService;

@Service
public class RolServiceImpl implements RolService {
    
    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public List<Rol> findAllCustom() {
        return rolRepository.findAllCustom();
    }

    @Override
    public List<Rol> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rol add(Rol ro) {
        return rolRepository.save(ro);
    }

    @Override
    public Rol update(Rol ro) {
        Rol objrol=rolRepository.getById(ro.getId_Rol());
        BeanUtils.copyProperties(ro, objrol);
        return rolRepository.save(objrol);
    }

    @Override
    public Rol delete(Rol ro){
        Rol objrol=rolRepository.getById(ro.getId_Rol());
        objrol.setEstado(false);
        return rolRepository.save(objrol);
    }

    @Override
    public Optional<Rol> findById(long id) {
        return rolRepository.findById(id);
    }
}
