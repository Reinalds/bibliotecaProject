package ValueObject;

public class Multa
{
    private double preco;
    private Emprestimo emprestimo;

    public Multa(double preco, Emprestimo emprestimo)
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

    public Emprestimo getEmprestimo() 
    {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) 
    {
        this.emprestimo = emprestimo;
    }
    
    
}
