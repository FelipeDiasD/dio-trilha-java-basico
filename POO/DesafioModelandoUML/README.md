```mermaid
classDiagram
    IPhone --|> ReprodutorMusical
    IPhone --|> AparelhoTelefonico
    IPhone --|> NavegadorInternet

    IPhone : 

   
    class ReprodutorMusical{
      +selecionarMusica(String musica)void
      +tocar() void
      +pausar()void
    }

    class AparelhoTelefonico{
      +ligar(String numero) void
      +atender()void
      +iniciarCorreioDeVoz()void
    }
    class NavegadorInternet{
      +exibirPagina(String url)void
      +atualizarPagina()void
      +adicionarNovaAba()void
    }
  ```