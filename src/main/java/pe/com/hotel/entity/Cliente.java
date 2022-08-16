package pe.com.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String Nombre;
    @Column(name = "apellidos_Paterno")
    private String Apellidos_Paterno;
    @Column(name = "apellidos_Materno")
    private String Apellidos_Materno;
    @Column(name = "fecha_Nac")
    private Date Fecha_Nac;
    @Column(name = "tipo_doc")
    private String Tipo_doc;
    @Column(name = "n_Doc")
    private int num_Doc;
    @Column(name = "correo")
    private String Correo;
    @Column(name = "telf")
    private int Telf;
    @Column(name = "sexo")
    private String Sexo;
    @Column(name = "cliest")
    private boolean estado;
    
}
