
import ListCollection.OperacoesBasicas.ListaDeTarefas;
import ListCollection.Pesquisa.CatalogoLivro;

public class App {
    public static void main(String[] args) throws Exception {
        
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
        
        System.out.println("------------------------------------------");

        System.out.println("------LIVROS------");
        CatalogoLivro catalogoLivro = new CatalogoLivro();

        
        catalogoLivro.adicionarNovoLivro("Livro 1", "Autor 1", 2000);
        catalogoLivro.adicionarNovoLivro("Livro 2", "Autor 1", 1996);
        catalogoLivro.adicionarNovoLivro("Livro 3", "Autor 2", 2003);
        catalogoLivro.adicionarNovoLivro("Livro 4", "Autor 3", 1998);
        catalogoLivro.adicionarNovoLivro("Livro 2", "Autor 4", 2010);

        System.out.println(catalogoLivro.pesquisarLivroPorAutor("Autor 1"));
        System.out.println(catalogoLivro.pesquisaLivroPorTitulo("Livro 2"));
        System.out.println(catalogoLivro.pesquisaPorIntervaloDeAno(2000, 2020));



    }
}
