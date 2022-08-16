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
@Entity(name="Reserva")
@Table(name="reserva")
public class Reserva implements Serializable{
    
    private static final long serialVersion=1L;
    @Id
    @Column(name = "idreserva")
    private long id_reserva;
    @Column(name = "costo")
    private double Costo;
    @Column(name = "cantP_Adultos")
    private int CantP_Adultos;
    @Column(name = "cantP_Niños")
    private int CantP_Niños;
    @Column(name = "fecha_ingreso")
    private Date Fecha_ingreso;
    @Column(name = "fecha_Salida")
    private Date Fecha_Salida;
    @Column(name = "usuario_registro")
    private String Usuario_registro;
    @Column(name = "fecha_Registro")
    private Date Fecha_Registro;
    @Column(name = "usuario_Modifico")
    private String Usuario_Modifico;
    @Column(name = "fecha_Modifico")
    private Date Fecha_Modifico;
    @Column(name = "resest")
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "idcliente",nullable = false)
    private Cliente clientes;
    @ManyToOne
    @JoinColumn(name = "idhabit",nullable = false)
    private Habitacion habitacion;
    @ManyToOne
    @JoinColumn(name = "idusuario",nullable = false)
    private Usuario usuario;
}
