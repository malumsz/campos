package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import modelo.Quadra;
import modelo.Usuario;

public class QuadraControle implements Serializable {

    private Quadra quadra;
    private Dao<Usuario> daoUsuario;
    private List<Usuario> listaUsuario;
    private Dao<Quadra> dao;

    public void iniciar() {

    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public void salvar() {
        dao.inserir(quadra);
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }
}
