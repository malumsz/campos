package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

public class Admin extends Pessoa implements Serializable {
    Boolean autenticar;

    public Admin() { 

    }

    public Admin(String cpf, String nome, String nomeUsuario, String senha, String codigo, String email) {
        this.autenticar = autenticar;
    }
    
    public Boolean getAutenticar() {
        return autenticar;
    }

    public void setAutenticar(Boolean autenticar) {
        this.autenticar = autenticar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Admin other = (Admin) obj;
        return true;
    }

    public Object getLogin() {
        return null;
    }
    
    
}
