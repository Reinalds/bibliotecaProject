package ValueObject;

public class FilaEsperaVO
{
    private int idAssociado;
    private String titulo;

    public FilaEsperaVO(int idAssociado, String titulo)
    {
        this.idAssociado = idAssociado;
        this.titulo = titulo;
    }

    public int getIdAssociado() 
    {
        return idAssociado;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setIdAssociado(int idAssociado) 
    {
        this.idAssociado = idAssociado;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    
}
