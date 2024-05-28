package MapCollection.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        agendaContatoMap = new HashMap<>();
    }


    public void adicionarContato(String nome, int numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){

        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }

    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }


    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        
        if(!agendaContatoMap.isEmpty()){
          numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos contatos = new AgendaContatos();

        contatos.adicionarContato("Felipe", 1299991212);
        contatos.adicionarContato("Angela", 1299872192);
        contatos.adicionarContato("Maria", 1299921314);
        contatos.adicionarContato("Jose", 1299212433);
        contatos.adicionarContato("Felipe", 1298123910);

        contatos.exibirContato();

        contatos.removerContato("Felipe");

        contatos.exibirContato();




    }

}


