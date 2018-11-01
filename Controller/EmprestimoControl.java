/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.naoDisponivelException;
import ValueObject.AssociadoVO;
import ValueObject.EmprestimoVO;
import ValueObject.FilaEsperaVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author snake
 */
public class EmprestimoControl {

    public void emprestarLivro(AssociadoVO associado, String titulo, int exemplar) throws SQLException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        LivroVO livro = new LivroVO(titulo, exemplar, false);
        EmprestimoVO emprestimoVO = new EmprestimoVO(date, associado, livro);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(emprestimoVO);
        
        /*if(emprestimoDAO.consultarDisponibilidadeLivro(titulo)) 
            emprestimoDAO.emprestarLivro(emprestimoVO);
        else
            throw new naoDisponivelException(titulo);
        */
        
    }

    public void emprestarRevista(AssociadoVO associado, String titulo, int exemplar) throws SQLException, naoDisponivelException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        RevistaVO revista = new RevistaVO(titulo, exemplar, false);
        EmprestimoVO emprestimoVO = new EmprestimoVO(date, associado, revista);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(emprestimoVO);
        
        /*if(emprestimoDAO.consultarDisponibilidadeRevista(titulo)) 
            emprestimoDAO.emprestarRevista(revista);
        else 
            throw new naoDisponivelException(titulo);
        */
    }

    public void devolverLivro(String titulo, int exemplar) throws SQLException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        LivroVO livroVO = new LivroVO(titulo, exemplar, false);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(livroVO, date);
        //emprestimoDAO.devolverLivro();
    }

    public void devolverRevista(String titulo, int exemplar) throws SQLException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        RevistaVO revistaVO = new RevistaVO(titulo, exemplar, false);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(revistaVO, date);
        //emprestimoDAO.devolverLivro();
        
    }
    
    public void adicionarListaEspera(int idAssociado, String titulo) {
        //FilaEsperaVO filaEsperaVO = new FilaEsperaVO(idAssociado, titulo);
        //emprestimoDAO.adicionarFilaEspera(filaEsperaVO); //Temos de ver como implementaremos a fila de espera
    }

}
