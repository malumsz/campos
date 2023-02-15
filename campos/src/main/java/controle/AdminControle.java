
package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import modelo.Usuario;
import modelo.Admin;
import util.JsfUtil;

public class AdminControle {
    
    private Admin admin;

    private Usuario usuario;



    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void iniciar() {
        
    }
    
    public Integer excluirReserva(Integer codigo) {
        return 0;
    }
    
    public String criarRecurso() {
        return "";
    }
    
    public String excluirUsuario(Usuario usuario) {
        return null;
    }
    
    public boolean verificaUsuario(Usuario usuario) {
        return true;
    }
    
    public Integer bloquearUsuario(Integer codigo) {
        return 0;
    }
    
    public String log(String log) {
        return "";
    }
    
    
}
