/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exceptions.EmptyException;
import Exceptions.InvalidDateException;
import ValueObject.AssociadoVO;
import ValueObject.EmprestimoVO;
import ValueObject.LivroVO;
import ValueObject.RevistaVO;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
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
        LivroVO livro = new LivroVO(titulo, exemplar);
        EmprestimoVO emprestimoVO = new EmprestimoVO(date, associado, livro);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(emprestimoVO);
        //emprestimoDAO.emprestarLivro();
        
    }

    public void emprestarRevista(AssociadoVO associado, String titulo, int exemplar) throws SQLException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        RevistaVO revista = new RevistaVO(titulo, exemplar);
        EmprestimoVO emprestimoVO = new EmprestimoVO(date, associado, revista);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(emprestimoVO);
        //emprestimoDAO.emprestarRevista();

    }

    public void devolverLivro(String titulo, int exemplar) throws SQLException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        LivroVO livroVO = new LivroVO(titulo, exemplar);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(livroVO, date);
        //emprestimoDAO.devolverLivro();
    }

    public void devolverRevista(String titulo, int exemplar) throws SQLException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
        dateFormat.format(date);
        RevistaVO revistaVO = new RevistaVO(titulo, exemplar);
        //EmprestimoDAO emprestimoDAO = new EmprestimoDAO(revistaVO, date);
        //emprestimoDAO.devolverLivro();
        
    }

}
