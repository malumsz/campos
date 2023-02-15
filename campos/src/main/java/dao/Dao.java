package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import util.ExcecaoCodigoNaoEncontrado;
import util.JpaUtil;

public class Dao<T> implements Serializable {

    private final Class<T> classe;
    private EntityManager manager;

    public Dao(Class<T> classe) {
        this.classe = classe;
    }

    public T alterar(T objeto) {
        return objeto;
    }

    public T iniciarReserva(T reserva) {
        return reserva;
    }

    public T buscarPorCodigo(Integer codigo) throws ExcecaoCodigoNaoEncontrado {
        return null;
    }

    public T buscarPorNome(String nome) {
        T temp = null;
        return temp;
    }

    public void excluir(Integer codigo) {
    }

    public void inserir(T objeto) {

    }

    public List<T> listarTodos() {
        return null;
    }

}
