package pe.com.hotel.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Rol")
@Table(name="rol")
public class Rol implements Serializable {
    
    private static final long serialVersion=1L;

    @Id
    @Column(name = "idrol")
    private long id_Rol;
    @Column(name = "nombre_cargo")
    private String Nombre_cargo;
    @Column(name = "rolest")
    private boolean estado;
    
}
