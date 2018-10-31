package Controller;

import Exceptions.EmptyException;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidSizeException;
import ValueObject.AssociadoVO;

public class AssociadoControl
{
    
    public void cadastrarAssociado(String nome, String telefone, String email) throws EmptyException, ImpossibleNumberException, InvalidSizeException
    {
        validarNome(nome);
        validarTelefone(telefone);
        
        
        AssociadoVO associadoVO = new AssociadoVO(nome, telefone, email);
        //AssociadoDAO dao = AssociadoDAO(associadoVO);
    }
    
    private void validarNome(String nome) throws EmptyException, ImpossibleNumberException
    {
        //Verifica se 'nome' está vazio
        if(nome.isEmpty())
            throw new EmptyException("nome");
        
        //Verifica se 'nome' possui valores numéricos 
        for(int i=0; i<nome.length();i++)
        {
            if(Character.isDigit(nome.charAt(i)))
                throw new ImpossibleNumberException("nome");
        }
        
    }
    
    private void validarTelefone(String telefone) throws EmptyException, InvalidSizeException
    {
        //Verifica se 'telefone' está vazio
        if(telefone.isEmpty())
            throw new EmptyException("telefone");
        
        //Verifica se 'telefone' possui tamanho inválido
        if(telefone.length() != 14)
            throw new InvalidSizeException("telefone");
            
    }
    
    private void validarEmail(String email) throws EmptyException
    {
        //Verifica se 'email' está vazio
        if(email.isEmpty())
            throw new EmptyException("email");
        
    }
}
