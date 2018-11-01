package ValueObject;

import java.util.ArrayList;

public class LivroVO extends ItemVO {
    private String localEdicao;
    private String codigoISBN;
    private ArrayList<String> palavrasChave;

    public LivroVO(String titulo, int exemplar, boolean disponivel, String localEdicao, String codigoISBN)
    {
        super(titulo, exemplar, disponivel);
        this.localEdicao = localEdicao;
        this.codigoISBN = codigoISBN;
        this.palavrasChave = new ArrayList();
    }
    
    public LivroVO(String titulo, int exemplar, boolean disponivel)
    {
        super(titulo, exemplar, disponivel);
    }

    public ArrayList<String> getPalavrasChave()
    {
        return palavrasChave;
    }

    public void setPalavrasChave(ArrayList<String> palavrasChave) 
    {
        this.palavrasChave = palavrasChave;
    }  
    public String getLocalEdicao()
    {
        return localEdicao;
    }

    public void setLocalEdicao(String localEdicao) 
    {
        this.localEdicao = localEdicao;
    }

    public String getCodigoISBN() 
    {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) 
    {
        this.codigoISBN = codigoISBN;
    }    
}
