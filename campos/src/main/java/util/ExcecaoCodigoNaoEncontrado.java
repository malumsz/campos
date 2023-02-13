package util;

public class ExcecaoCodigoNaoEncontrado extends Exception {
    
    public ExcecaoCodigoNaoEncontrado(Integer codigo){
        super("Não existe objeto com o codigo: " + codigo); 
    }
    
}
