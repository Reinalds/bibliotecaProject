package ValueObject;

import java.util.Date;

public class RevistaVO extends Item
{
    private Date dataEdicao;

    public RevistaVO(String titulo, int exemplar, boolean disponivel, Date dataEdicao)
    {
        super(titulo, exemplar, disponivel);
        this.dataEdicao = dataEdicao;
    }

    public Date getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(Date dataEdicao) {
        this.dataEdicao = dataEdicao;
    }
    
    
}
