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
@Entity(name="tipo_habitacion")
@Table(name="tipo_habitacion")
public class TipoHabitacion implements Serializable {
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "idtip")
    private long id_TipoHabit;
    @Column(name = "categoria")
    private String Categoria;
    @Column(name = "camas")
    private int Camas;
    @Column(name = "baños")
    private int baños;
    @Column(name = "terrazas")
    private int Terrazas;
    @Column(name = "precio")
    private double Precio;
    @Column(name = "tipest")
    private boolean estado;
}
