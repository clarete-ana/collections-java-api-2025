package Set;

import java.util.HashSet;
import java.util.Set;

    public class ConjuntoConvidados {

        Set<Convidado> convidadoSet;

        public ConjuntoConvidados(){
            convidadoSet = new HashSet<>();
        }

        public void adicionarConvidado(String nome, int codigoConvite){
            convidadoSet.add(new Convidado(nome,codigoConvite));
        }

        public void removerConvidadoPorCodigoConvite(int codigoConvite){
            Convidado convidadoParaRemover = null;

            for(Convidado c : convidadoSet){
                if (c.getCodigoConvite() == (codigoConvite)){
                    convidadoParaRemover = c;
                    break;
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        }

        public int contarConvidados(){
            return convidadoSet.size();
        }

        public void exibirConvidados(){
            System.out.println(convidadoSet);
        }

        public static void main(String[] args) {
            ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
            System.out.println("Existem" + conjuntoConvidados.contarConvidados() + "convidados no set de convidados");

            conjuntoConvidados.adicionarConvidado("Set.Convidado 1",1234);
            conjuntoConvidados.adicionarConvidado("Set.Convidado 2", 1235);
            conjuntoConvidados.adicionarConvidado("Set.Convidado 3",1237);
            conjuntoConvidados.adicionarConvidado("Set.Convidado 4", 1235);

            System.out.println("Existem" + conjuntoConvidados.contarConvidados() + "convidados no set de convidados");

            conjuntoConvidados.removerConvidadoPorCodigoConvite(1237);
            conjuntoConvidados.exibirConvidados();
        }
    }
