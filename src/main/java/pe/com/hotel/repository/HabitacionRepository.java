package pe.com.hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.hotel.entity.Habitacion;

public interface HabitacionRepository extends JpaRepository<Habitacion, Long>{
    
    @Query("select ha from Habitacion ha where ha.estado='1'")
    List<Habitacion> findAllCustom();
    
}
