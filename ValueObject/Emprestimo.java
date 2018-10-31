package ValueObject;

import java.util.Date;


public class Emprestimo 
{
    private Date dataEmprestimo, dataDevolucao;
    private AssociadoVO associado;
    private Item item;

    public Emprestimo(Date dataEmprestimo, Date dataDevolucao, AssociadoVO associado, Item item)
    {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.associado = associado;
        this.item = item;
    }
    
    public void setDataEmprestimo(Date dataEmprestimo)
    {
        this.dataEmprestimo = dataEmprestimo;
    }
    
    public Date getDataEmprestimo()
    {
        return dataEmprestimo;
    }
    
    public void setDataDevolucao(Date dataDevolucao)
    {
        this.dataDevolucao = dataDevolucao;
    }
    
    public Date getDataDevolucao()
    {
        return dataDevolucao;
    }
    
    public void setAssociado(AssociadoVO associado)
    {
        this.associado = associado;
    }
    
    public AssociadoVO getAssociado()
    {
        return associado;
    }
    
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    
    
}
