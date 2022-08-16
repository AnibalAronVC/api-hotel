package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.TipoHabitacion;
import pe.com.hotel.repository.TipoHabitacionRepository;
import pe.com.hotel.service.TipoHabitacionService;

@Service

public class TipoHabitacionImpl implements TipoHabitacionService {
    
    @Autowired
    private TipoHabitacionRepository thabitacionRepository;

    @Override
    public List<TipoHabitacion> findAll() {
        return thabitacionRepository.findAll();
    }

    @Override
    public List<TipoHabitacion> findAllCustom() {
        return thabitacionRepository.findAllCustom();
    }

    @Override
    public List<TipoHabitacion> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<TipoHabitacion> findById(long id) {
        return thabitacionRepository.findById(id);
    }

    @Override
    public TipoHabitacion add(TipoHabitacion th) {
        return thabitacionRepository.save(th);
    }

    @Override
    public TipoHabitacion update(TipoHabitacion th) {
        TipoHabitacion objthabitacion=thabitacionRepository.getById(th.getId_TipoHabit());
        BeanUtils.copyProperties(th, objthabitacion);
        return thabitacionRepository.save(objthabitacion);
    }

    @Override
    public TipoHabitacion delete(TipoHabitacion th){
        TipoHabitacion objthabitacion=thabitacionRepository.getById(th.getId_TipoHabit());
        objthabitacion.setEstado(false);
        return thabitacionRepository.save(objthabitacion);
    }
    
}
