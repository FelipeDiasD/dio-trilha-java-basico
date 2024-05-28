package MapCollection.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        estoqueProdutosMap = new HashMap<>();
    }

    public void adicionaProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){

                valorTotalEstoque += (p.getQuantidade() * p.getPreco());
            }

        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreço = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            
            for(Produto p: estoqueProdutosMap.values()){

                if(p.getPreco() > maiorPreço){
                    produtoMaisCaro = p;
                    maiorPreço = p.getPreco();
                }

            }
        }
      return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionaProduto(1, "Prod1", 10, 5);
        estoqueProdutos.adicionaProduto(2, "Prod2", 12, 2);
        estoqueProdutos.adicionaProduto(3, "Prod3", 5, 3);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque é: " + estoqueProdutos.calculaValorTotalEstoque());
        System.out.println("O produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());
    }

}
