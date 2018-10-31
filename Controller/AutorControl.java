
package Controller;

import Exceptions.EmptyException;
import Exceptions.ImpossibleNumberException;
import ValueObject.AutorVO;

public class AutorControl {
    
    public void cadastrarAutor(String nome) throws EmptyException, ImpossibleNumberException{
        validarNome(nome);
        
        AutorVO autorVO = new AutorVO(nome);
        //AutorDAO dao = AutorDAO(autorVO);
        
    }
    
    private void validarNome(String nome) throws EmptyException, ImpossibleNumberException{
        if(nome.isEmpty())
            throw new EmptyException("nome");
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<nome.length();i++)
        {
            if(Character.isDigit(nome.charAt(i)))
                throw new ImpossibleNumberException("nome");
        }
    }
    
    
}
