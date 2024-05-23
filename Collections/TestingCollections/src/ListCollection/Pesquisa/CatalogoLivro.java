package ListCollection.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    public List<Livro> livroList;

    public CatalogoLivro(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarNovoLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }


    public List<Livro> pesquisarLivroPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAno(int anoInicial, int anoFinal){
        
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                
                if(l.getAnoPublicacao() >= anoInicial 
                    && l.getAnoPublicacao() <= anoFinal){
                        livrosPorIntervaloDeAnos.add(l);
                    }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisaLivroPorTitulo(String titulo){
        Livro livro = null;

        if(!livroList.isEmpty()){

            for(Livro l : livroList){

                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

    public static void main(String[] args){
          
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
