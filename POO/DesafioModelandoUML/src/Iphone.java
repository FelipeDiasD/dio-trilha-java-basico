import Aparelhos.AparelhoTelefonico;
import Aparelhos.NavegadorInternet;
import Aparelhos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    }
    @Override
    public void atender(){
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println(musica + " selecionada!");
    }
    
    @Override
    public void tocar(){
        System.out.println("Tocando musica selecionada!");
    }

    @Override
    public void pausar(){
        System.out.println("Pausando musica selecionada!");
    }
    


   
}
