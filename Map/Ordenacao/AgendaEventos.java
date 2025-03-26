package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data,evento);
    }

    public void exibirEventos(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate,Evento> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2022,7,9), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2000,Month.JANUARY,10),"Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2025,Month.MARCH,26),"Evento 4", "Atração 4");
        agenda.adicionarEvento(LocalDate.of(2025,Month.APRIL,15), "Evento 5", "Atração 5");

        agenda.exibirEventos();

        agenda.obterProximoEvento();

    }
}
