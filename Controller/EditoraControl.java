
package Controller;

import Exceptions.EmptyException;
import Exceptions.ImpossibleNumberException;
import ValueObject.EditoraVO;

public class EditoraControl {
    public void cadastrarEditora(String nome) throws EmptyException, ImpossibleNumberException{
        validarNome(nome);
        
        EditoraVO editoraVO = new EditoraVO(nome);
        //EditoraDAO dao = EditoraDAO(editoraVO);
        
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
