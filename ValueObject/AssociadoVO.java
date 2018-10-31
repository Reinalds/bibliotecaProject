package ValueObject;

public class AssociadoVO
{
    private int idAssociado;
    private String nome, telefone, email;

    public AssociadoVO(int idAssociado, String nome, String telefone, String email) 
    {
        this.idAssociado = idAssociado;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public AssociadoVO(String nome, String telefone, String email)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public int getIdAssociado()
    {
        return idAssociado;
    }

    public String getNome()
    {
        return nome;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setIdAssociado(int idAssociado) 
    {
        this.idAssociado = idAssociado;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    
    
}
