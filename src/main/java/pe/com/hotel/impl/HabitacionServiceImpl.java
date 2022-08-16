package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.Habitacion;
import pe.com.hotel.repository.HabitacionRepository;
import pe.com.hotel.service.HabitacionService;

@Service
public class HabitacionServiceImpl implements HabitacionService{
    @Autowired 
    private HabitacionRepository habitacionRepository;
    
    @Override
    public List<Habitacion> findAll() {
        return habitacionRepository.findAll();
    }

    @Override
    public List<Habitacion> findAllCustom() {
        return habitacionRepository.findAllCustom();
    }

    @Override
    public List<Habitacion> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Habitacion> findById(long id) {
        return habitacionRepository.findById(id);
    }

    @Override
    public Habitacion add(Habitacion ha) {
        return habitacionRepository.save(ha);
    }

    @Override
    public Habitacion update(Habitacion ha) {
        Habitacion objHabitacion=habitacionRepository.getById(ha.getId_Habit());
        BeanUtils.copyProperties(ha, objHabitacion);
        return habitacionRepository.save(objHabitacion);
    }

    @Override
    public Habitacion delete(Habitacion ha) {
        Habitacion objHabitacion=habitacionRepository.getById(ha.getId_Habit());
        objHabitacion.setEstado(false);
        return habitacionRepository.save(objHabitacion);
    }
}
