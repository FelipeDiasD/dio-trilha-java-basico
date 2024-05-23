package SetCollection.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos(){
        contatos = new HashSet<>();
    }


    public void adicionaContato(String nome, int numero){
        contatos.add(new Contato(nome,numero));
    }

    public void exibirContato(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisaPorNome(String nome){

        Set<Contato> contatosPorNome = new HashSet<>();

        for(Contato c: contatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
                
            }
        }
        return contatosPorNome;
    }

    public Contato atualizaNumeroDeContato(String nome, int numero){
        Contato contatoAtualizado = null;

        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }


    public static void main(String[] args) {
        
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContato();

        agenda.adicionaContato("Contato 1", 12345);
        agenda.adicionaContato("Contato 1", 13345);
        agenda.adicionaContato("Contato 3", 14345);
        agenda.adicionaContato("Contato 4", 15345);

        agenda.exibirContato();
    }
}
    




