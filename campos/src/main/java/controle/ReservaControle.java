package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import modelo.Quadra;
import modelo.Reserva;
import util.JsfUtil;

public class ReservaControle implements Serializable {

    private Reserva reserva;
    private Dao<Reserva> daoReserva;
    private List<Quadra> listaQuadra;
    private Dao<Quadra> daoQuadra;
    private List<Reserva> listaReserva;

    public void iniciar() {

    }

    public List<Reserva> getlistaReserva() {
        return listaReserva;
    }

    public void setListaReserva(List<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public List<Quadra> getListaQuadra() {
        return listaQuadra;
    }

    public void setListaQuadra(List<Quadra> listaQuadra) {
        this.listaQuadra = listaQuadra;
    }

    public void salvar() {
        daoReserva.inserir(reserva);
    }

    public void excluir(Reserva excluir) {

    }
    
    public void alterar(Reserva alterar) {
        this.reserva = alterar;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void verificarReserva(String horario) {
            
    }

    public String salvarAlteracao() {
        return null;
    }
    
}
