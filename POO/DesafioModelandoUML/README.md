```mermaid
classDiagram
    IPhone <|-- ReprodutorMusical
    IPhone <|-- AparelhoTelefonico
    IPhone <|-- NavegadorInternet

    IPhone : +selecionarMusica(String musica)void
    IPhone : +tocar() void
    IPhone : +pausar()void

    IPhone : +exibirPagina(String url)void
    IPhone : +atualizarPagina()void
    IPhone : +adicionarNovaAba()void

    IPhone : +ligar(String numero) void
    IPhone : +atender()void
    IPhone : +iniciarCorreioDeVoz()void

   
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