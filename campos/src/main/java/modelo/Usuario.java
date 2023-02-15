package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Usuario extends Pessoa implements Serializable {
    private String tipo;
    public Boolean pendente;

    public Boolean getPendente() {
        return pendente;
    }

    public void setPendente(Boolean pendente) {
        this.pendente = pendente;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Usuario() {

    }

    public Usuario(Boolean pendente, String cpf, String nome, String nomeusuario, String senha, String codigo, String email, String tipo) {
        super(nome, cpf, email, codigo, nomeusuario, senha);
        this.tipo = tipo;
        this.pendente = pendente;
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
        final Usuario other = (Usuario) obj;
        
        return true;
    }

    public Object getLogin() {
        return null;
    }
    
    
}
