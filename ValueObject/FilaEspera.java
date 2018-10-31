package ValueObject;

import java.util.ArrayList;

public class FilaEspera
{
    private ArrayList<AssociadoVO> associado;
    private String titulo;

    public FilaEspera(ArrayList<AssociadoVO> associado, String titulo)
    {
        this.associado = associado;
        this.titulo = titulo;
    }

    public ArrayList<AssociadoVO> getAssociado() 
    {
        return associado;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setAssociado(ArrayList<AssociadoVO> associado) 
    {
        this.associado = associado;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    
}
