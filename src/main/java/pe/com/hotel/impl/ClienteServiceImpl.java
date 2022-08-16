package pe.com.hotel.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.hotel.entity.Cliente;
import pe.com.hotel.repository.ClienteRepository;
import pe.com.hotel.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepository.findAllCustom();
    }

    @Override
    public List<Cliente> findbyName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente add(Cliente cl) {
        return clienteRepository.save(cl);
    }

    @Override
    public Cliente update(Cliente c) {
        Cliente objcliente=clienteRepository.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcliente);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente c){
        Cliente objcliente=clienteRepository.getById(c.getCodigo());
        objcliente.setEstado(false);
        return clienteRepository.save(objcliente);
    }

    @Override
    public Optional<Cliente> findById(long id) {
        return clienteRepository.findById(id);
    }
}
