
package Controller;

import Exceptions.EmptyException;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidSizeException;
import ValueObject.LivroVO;
import java.util.ArrayList;


public class LivroControl {
    

    public void cadastrarLivro(String titulo, String exemplar, String disponivel, String localEdicao, String codigoISBN, ArrayList<String> palavrasChaves) throws EmptyException, ImpossibleNumberException, InvalidSizeException{
        validarTitulo(titulo);
        validarExemplar(exemplar);
        validarLocalEdicao(localEdicao);
        validarISBN(codigoISBN);
        validarPalavrasChaves(palavrasChaves);
        
        LivroVO livroVO = new LivroVO(titulo, Integer.parseInt(exemplar), Boolean.parseBoolean(disponivel), localEdicao, codigoISBN);
        //LivroDO dao = LivroDAO(livroVO);
    }
    private void validarTitulo(String titulo) throws EmptyException, ImpossibleNumberException{
        if(titulo.isEmpty())
            throw new EmptyException("titulo");
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<titulo.length();i++)
        {
            if(Character.isDigit(titulo.charAt(i)))
                throw new ImpossibleNumberException("titulo");
        }
    }
    private void validarExemplar(String exemplar) throws InvalidSizeException{
        if(Integer.parseInt(exemplar) < 0){
            throw new InvalidSizeException("exemplar");
        }
    }
    private void validarISBN(String codigoISBN) throws EmptyException, InvalidSizeException{
        if(codigoISBN.isEmpty())
            throw new EmptyException("codigoISBN");
        
         if(codigoISBN.length() != 13)
            throw new InvalidSizeException("codigoISBN");
    }
    
    private void validarLocalEdicao(String localEdicao) throws EmptyException{
        if(localEdicao.isEmpty())
            throw new EmptyException("localEdicao");
    }
    
    private void validarPalavrasChaves(ArrayList<String> palavrasChaves) throws EmptyException{
        if(palavrasChaves.isEmpty())
            throw new EmptyException("palavrasChaves");
    }
}
