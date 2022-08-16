package pe.com.hotel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.hotel.entity.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    @Query("select re from Reserva re where re.estado='1'")
    List<Reserva> findAllCustom();
}
