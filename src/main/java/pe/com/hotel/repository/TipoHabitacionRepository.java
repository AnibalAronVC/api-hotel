package pe.com.hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.hotel.entity.TipoHabitacion;

//
public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Long> {
    
    //error here
    @Query("select th from tipo_habitacion th where th.estado='1'")
    List<TipoHabitacion> findAllCustom();
    
}
