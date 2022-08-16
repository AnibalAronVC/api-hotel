package pe.com.hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.hotel.entity.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
 
    @Query("select ro from Rol ro where ro.estado='1'")
    List<Rol> findAllCustom();
}
