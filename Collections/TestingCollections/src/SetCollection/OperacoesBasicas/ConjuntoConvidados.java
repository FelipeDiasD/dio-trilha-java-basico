package SetCollection.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoDoConvite){
        convidados.add(new Convidado(nome, codigoDoConvite));
    }

    public void removerConvidadoPorCodigoDoConvite(int codigoDoConvite){

        Convidado convidadoParaRemover = null;

        for(Convidado c: convidados){
            if(c.getCodigoDoConvite() == codigoDoConvite){
                convidadoParaRemover = c;
                break;
            }

        }

        convidados.remove(convidadoParaRemover);

    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String [] args){

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");


        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 3214);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2134);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1324);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1324);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados");

        conjuntoConvidados.exibirConvidados();

    } 

}
