package ValueObject;

public class MultaVO
{
    private double preco;
    private EmprestimoVO emprestimo;

    public MultaVO(double preco, EmprestimoVO emprestimo)
    {
        this.preco = preco;
        this.emprestimo = emprestimo;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public EmprestimoVO getEmprestimo() 
    {
        return emprestimo;
    }

    public void setEmprestimo(EmprestimoVO emprestimo) 
    {
        this.emprestimo = emprestimo;
    }
    
    
}