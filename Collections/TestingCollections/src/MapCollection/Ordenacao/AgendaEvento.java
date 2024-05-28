package MapCollection.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento(){
        this.eventoMap = new HashMap<>();
    }

    public void adicionaEvento(LocalDate data, String nome, String evento){
        eventoMap.put(data, new Evento(nome, evento));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proxEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){

            if(entry.getKey().isEqual(dataAtual) || 
                entry.getKey().isAfter(dataAtual)){ 

                    proximaData = entry.getKey();
                    proxEvento = entry.getValue();

                    System.out.println("O próximo evento: "+ proxEvento +
                    "acontecerá na data: " + proximaData);
                    break;
             
                
            }
        }
    }

    
    public static void main(String[] args){

        AgendaEvento eventos = new AgendaEvento();

        eventos.adicionaEvento(LocalDate.of
        (2024, Month.MAY,25), "Show AmarElo", "Show emicida");
        eventos.adicionaEvento(LocalDate.of
        (2024, Month.MAY,30), "Festa do arroz", "Apresentação da banda");
        eventos.adicionaEvento(LocalDate.of
        (2024, Month.AUGUST,25), "Festa de Aniversário", "Entrada do banquete");
        eventos.adicionaEvento(LocalDate.of
        (2024, Month.APRIL,5), "Oficina de bolo", "Viagem a fabrica de bolos");
        
        
        eventos.exibirAgenda();

        eventos.obterProximoEvento();
    }
}
