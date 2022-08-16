package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.Reserva;
import pe.com.hotel.repository.ReservaRepository;
import pe.com.hotel.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService{
    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    @Override
    public List<Reserva> findAllCustom() {
        return reservaRepository.findAllCustom();
    }

    @Override
    public List<Reserva> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<Reserva> findById(long id) {
        return reservaRepository.findById(id);
    }

    @Override
    public Reserva add(Reserva re) {
        return reservaRepository.save(re);
    }

    @Override
    public Reserva update(Reserva re) {
        Reserva objreserva=reservaRepository.getById(re.getId_reserva());
        BeanUtils.copyProperties(re, objreserva);
        return reservaRepository.save(objreserva);
    }

    @Override
    public Reserva delete(Reserva re){
        Reserva objreserva=reservaRepository.getById(re.getId_reserva());
        objreserva.setEstado(false);
        return reservaRepository.save(objreserva);
    }
}
