package ValueObject;

public class AutorVO
{
    private String nome;
    private int idAutor;

    public AutorVO(String nome, int idAutor) {
        this.nome = nome;
        this.idAutor = idAutor;
    }
    public AutorVO(String nome){
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdAutor() 
    {
        return idAutor;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setIdAutor(int idAutor)
    {
        this.idAutor = idAutor;
    }
    
    
}
