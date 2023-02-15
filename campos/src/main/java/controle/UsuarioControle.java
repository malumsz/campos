package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Reserva;
import modelo.Usuario;
import util.JsfUtil;

public class UsuarioControle implements Serializable {

    private Usuario usuario;
    private Reserva reserva;
    private List<Usuario> listaUsuarios;
    private Dao<Usuario> dao;
    private Boolean mostraPopup;

    public void iniciar() {
    }
    
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void cancelarReserva() {
        
    }
}
