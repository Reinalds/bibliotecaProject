package ValueObject;

import java.util.Date;

public class RevistaVO extends ItemVO
{
    private Date dataEdicao;

    public RevistaVO(String titulo, int exemplar, boolean disponivel, Date dataEdicao)
    {
        super(titulo, exemplar, disponivel);
        this.dataEdicao = dataEdicao;
    }
    
    public RevistaVO(String titulo, int exemplar, boolean disponivel)
    {
        super(titulo, exemplar, disponivel);
    }

    public Date getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(Date dataEdicao) {
        this.dataEdicao = dataEdicao;
    }
    
    
}
