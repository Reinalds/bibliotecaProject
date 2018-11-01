package ValueObject;

/**
 *
 * @author felip
 */
public abstract class ItemVO 
{
    private String titulo;
    private int exemplar;
    private boolean disponivel;

    public ItemVO(String titulo, int exemplar, boolean disponivel) 
    {
        this.titulo = titulo;
        this.exemplar = exemplar;
        this.disponivel = disponivel;
    }
    
    public ItemVO(String titulo, int exemplar) 
    {
        this.titulo = titulo;
        this.exemplar = exemplar;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public int getExemplar() 
    {
        return exemplar;
    }

    public boolean isDisponivel() 
    {
        return disponivel;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public void setExemplar(int exemplar) 
    {
        this.exemplar = exemplar;
    }

    public void setDisponivel(boolean disponivel) 
    {
        this.disponivel = disponivel;
    }
    
    
}
