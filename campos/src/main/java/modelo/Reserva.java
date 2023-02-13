package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Reserva implements Serializable {    
    private Integer codigo; 
    private Quadra quadra;    
    private Date dataReserva; 
    private String horario;   
    private String nome;
    
    public Reserva() {
    }

    public Reserva(Quadra quadra, Date dataReserva, String nome, Integer codigo) {
        this.quadra = quadra;
        this.dataReserva = dataReserva;
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public Quadra getQuadra() {
        return quadra;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    public Date getDataReserva() {
        return dataReserva;
    }
    
    public String getnome() {
        return nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
    
   public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }  
    
}
