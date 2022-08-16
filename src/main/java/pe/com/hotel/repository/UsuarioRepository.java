package pe.com.hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.hotel.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
    @Query("select us from Usuario us where us.estado='1'")
    List<Usuario> findAllCustom();
}
