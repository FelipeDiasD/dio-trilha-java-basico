package ListCollection.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenaPorIdade(){

        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordernaPorAltura(){

        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorAltura, new comparatorPorAltura());

        return pessoaPorAltura;
    }


    public static void main(){
        
        System.out.println("------PESSOAS------");

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 21, 1.90);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 40, 1.72);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 19, 1.65);


        System.out.println(ordenacaoPessoa.ordenaPorIdade());
        System.out.println(ordenacaoPessoa.ordernaPorAltura());


    } 
}
