package pe.com.hotel.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="Usuario")
@Table(name="usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersion=1L;

    @Id
    @Column(name = "idusuario")
    private long id_usuario;
    @Column(name = "nombre")
    private String Nombre;
    @Column(name = "apellidos_Paterno")
    private String Apellidos_Paterno;
    @Column(name = "apellidos_Materno")
    private String Apellidos_Materno;
    @Column(name = "sexo")
    private String Sexo;
    @Column(name = "correo")
    private String Correo;
    @Column(name = "contraseña")
    private String Contraseña;
    @Column(name = "usuest")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "idrol",nullable = false)
    private Rol rol;
    
}
