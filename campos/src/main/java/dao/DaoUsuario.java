package dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Admin;
import modelo.Usuario;
import util.JpaUtil;

public class DaoUsuario implements Serializable {

    EntityManager manager;

    public Admin autenticar(Admin u) {
        Admin temp = null;
        return temp;
    }

    public Admin autenticar(Usuario u) {
        Admin temp = null;
        return temp;
    }

    public boolean verificarExistencia(String login) {
        Admin temp = null;
        boolean existe = false;
        return existe;
    }

}
