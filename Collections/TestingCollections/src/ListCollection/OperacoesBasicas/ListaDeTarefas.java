package ListCollection.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

    private List<Tarefa> tarefaList;


    public ListaDeTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao){
      tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t: tarefaList){

            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);

    }


    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesDeTarefas(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        
        System.out.println("------TAREFAS------");
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        System.out.println("O número total de tarefas na lista é: " 
            + listaDeTarefas.obterNumeroTotalDeTarefas());

        listaDeTarefas.adicionaTarefa("Tarefa 1");

        System.out.println("O número total de tarefas na lista é: " 
            + listaDeTarefas.obterNumeroTotalDeTarefas());

            listaDeTarefas.adicionaTarefa("Tarefa 2");
            listaDeTarefas.adicionaTarefa("Tarefa 3");
            listaDeTarefas.adicionaTarefa("Tarefa 4");

        System.out.println("O número total de tarefas na lista é: " 
            + listaDeTarefas.obterNumeroTotalDeTarefas());

            listaDeTarefas.removeTarefa("Tarefa 1");
        
        System.out.println("O número total de tarefas na lista é: " 
            + listaDeTarefas.obterNumeroTotalDeTarefas());

        listaDeTarefas.obterDescricoesDeTarefas();
    }
}
