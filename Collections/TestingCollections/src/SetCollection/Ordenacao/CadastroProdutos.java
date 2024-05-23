package SetCollection.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;


    public CadastroProdutos(){
        produtos = new HashSet<>();
    }

    public void adicionaProduto(String nome, long codigo, double preco, int quantidade){
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){

        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;
    }



    public static void main(String[] args){
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionaProduto("Prod1", 1, 2, 1);
        cadastroProdutos.adicionaProduto("Prod2", 2, 4, 1);
        cadastroProdutos.adicionaProduto("Prod3", 3, 3, 1);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        

    } 



}
