package ValueObject;

import java.util.ArrayList;

public class FilaEsperaVO
{
    private AssociadoVO associado;
    private String titulo;

    public FilaEsperaVO(AssociadoVO associado, String titulo)
    {
        this.associado = associado;
        this.titulo = titulo;
    }

    public AssociadoVO getAssociado() 
    {
        return associado;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setAssociado(AssociadoVO associado) 
    {
        this.associado = associado;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    
}
