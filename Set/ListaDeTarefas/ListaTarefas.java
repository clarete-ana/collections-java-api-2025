package Set.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefas> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao, boolean concluida){
        listaTarefas.add(new Tarefas(descricao,concluida));
    }

    public void removerTarefa(String descricao){
        for (Tarefas t: listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                listaTarefas.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefas);
    }

    public void contarTarefas(){
        System.out.println(listaTarefas.size());
    }

    public Set<Tarefas> obterTarefasConcluidas(){
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for (Tarefas t : listaTarefas){
            if(t.isTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes(){
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for (Tarefas t: listaTarefas) {
            if (!t.isTarefaConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefas t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
                System.out.println("Tarefa concluída : " + t);
                break;
            }
        }

    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefas t: listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(false);
                System.out.println("Tarefa pendente: " + t);
                break;
            }
        }
    }

    public void limparListaTarefa(){
        listaTarefas.clear();
    }

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();
        tarefas.exibirTarefas();

        tarefas.adicionarTarefa("tarefa 2",true);
        tarefas.adicionarTarefa("tarefa 1", true);
        tarefas.adicionarTarefa("tarefa 3 ",false);
        tarefas.adicionarTarefa("tarefa 4" ,false);
        tarefas.adicionarTarefa("tarefa 5",false);

        tarefas.exibirTarefas();

        tarefas.removerTarefa("tarefa 1");

        tarefas.exibirTarefas();

        tarefas.contarTarefas();

        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes : " + tarefas.obterTarefasPendentes());
        tarefas.marcarTarefaConcluida("tarefa 4");
        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());
        tarefas.marcarTarefaPendente("tarefa 2");
        System.out.println("Tarefas concluídas: " + tarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + tarefas.obterTarefasPendentes());
        tarefas.removerTarefa("tarefa 4");
        tarefas.exibirTarefas();



    }




}
