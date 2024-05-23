package SetCollection.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{

    private String nomeDoProduto;

    private long codigoDoProduto;

    private double precoDoProduto;

    private int quantidade;

    public Produto(String nomeDoProduto, long codigoDoProduto, double precoDoProduto, int quantidade) {
        this.nomeDoProduto = nomeDoProduto;
        this.codigoDoProduto = codigoDoProduto;
        this.precoDoProduto = precoDoProduto;
        this.quantidade = quantidade;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public long getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setCodigoDoProduto(long codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nomeDoProduto + 
        ", codigo: " + codigoDoProduto + 
        ", preco: " + precoDoProduto + 
        ", qnt: " + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigoDoProduto ^ (codigoDoProduto >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoDoProduto != other.codigoDoProduto)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        return nomeDoProduto.compareToIgnoreCase(o.getNomeDoProduto());
    }

 

    

    
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrecoDoProduto(),p2.getPrecoDoProduto());
    }
    
}