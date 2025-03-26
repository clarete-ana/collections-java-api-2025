package Set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda ;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agenda.add(new Contato(nome,numero));
    }

    public void exibirContato(){
        if(!agenda.isEmpty()){
            System.out.println("Contatos na agenda");
            System.out.println(agenda);
        }else{
            System.out.println("A agenda se encontra vazia");
        }
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : agenda){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome,int numero){
        Contato contatoAtualizado = null;
            for (Contato c: agenda) {
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(numero);
                    contatoAtualizado = c;
                    System.out.println("Numero atualizado para: " + c);
                    break;
                }

            }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.exibirContato();

        agenda.adicionarContato("Camila", 123456);
        agenda.adicionarContato("Camila", 123654);
        agenda.adicionarContato("Camila Cavalcante",3216549);
        agenda.adicionarContato("Camila DIO", 321654);
        agenda.adicionarContato("Maria Silva", 654987);

        agenda.exibirContato();

        System.out.println(agenda.pesquisarPorNome("Camila"));

        agenda.atualizarNumeroContato("Camila Cavalcante", 111111111);
        System.out.println(agenda.pesquisarPorNome("Camila DIO"));
    }
}
