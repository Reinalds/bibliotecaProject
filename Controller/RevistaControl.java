
package Controller;

import Exceptions.EmptyException;
import Exceptions.ImpossibleNumberException;
import Exceptions.InvalidDateException;
import Exceptions.InvalidSizeException;
import ValueObject.RevistaVO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class RevistaControl {
    private Date dataEdicao;
    public void cadastrarRevista(String titulo, String exemplar, String disponivel, String dataEdicao) throws EmptyException, ImpossibleNumberException, InvalidSizeException, InvalidDateException, ParseException{
        
        validarTitulo(titulo);
        validarExemplar(exemplar);
        
        RevistaVO revistaVO = new RevistaVO(titulo, Integer.parseInt(exemplar), Boolean.parseBoolean(disponivel), validarDataEdicao(dataEdicao));
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
        //informa um valor negativo de exemplares
        if(Integer.parseInt(exemplar) < 0){
            throw new InvalidSizeException("exemplar");
        }
    }
    
    private Date validarDataEdicao(String dataEdicao) throws EmptyException, InvalidDateException, ParseException{
        if(dataEdicao.isEmpty())
            throw new EmptyException("dataEdicao");
        
        if(dataEdicao.length() != 10)
            throw new InvalidDateException("dataEdicao");
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = formato.parse(dataEdicao);

        return dataFormatada;
    }
}
