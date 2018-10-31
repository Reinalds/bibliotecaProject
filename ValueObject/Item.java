package ValueObject;

/**
 *
 * @author felip
 */
public abstract class Item 
{
    private String titulo;
    private int exemplar;
    private boolean disponivel;

    public Item(String titulo, int exemplar, boolean disponivel) 
    {
        this.titulo = titulo;
        this.exemplar = exemplar;
        this.disponivel = disponivel;
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
