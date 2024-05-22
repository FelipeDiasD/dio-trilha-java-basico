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
}
