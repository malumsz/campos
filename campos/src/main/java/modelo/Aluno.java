package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Aluno implements Serializable {
    private String nome;
    private String cpf;
    private String codigo;
    private String nomeusuario;
    private String senha;
    private String email;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setUsername(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getnomeusuario() {
        return nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    private Date dataNascimento;

    public Aluno() {
    }

    public Aluno(String nome, String email, String senha, String nomeusuario, String cpf, String codigo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.nomeusuario = nomeusuario;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
