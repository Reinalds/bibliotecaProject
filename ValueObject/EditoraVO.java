package ValueObject;

public class EditoraVO
{
    private String nome;
    private int idEditora;

    public EditoraVO(String nome, int idEditora)
    {
        this.nome = nome;
        this.idEditora = idEditora;
    }
    public EditoraVO(String nome){
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getIdEditora()
    {
        return idEditora;
    }

    public void setIdEditora(int idEditora) 
    {
        this.idEditora = idEditora;
    }
    
    
}
