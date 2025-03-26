package Set.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> palavrasUnicasSet = new HashSet<>();

    public void adicionarPalavra(String palavraUnica){
        palavrasUnicasSet.add(palavraUnica);
    }

    public void removerPalavra(String palavraUnica){
        if(!palavrasUnicasSet.isEmpty()){
           if(palavrasUnicasSet.contains(palavraUnica)){
               palavrasUnicasSet.remove(palavraUnica);
           }else{
               System.out.println("Palavra não encontrada no conjunto");
           }
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            return palavrasUnicasSet.contains(palavra);
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        if(!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else{
            System.out.println("O conjunto está vazio");
        }

    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Azeitona");
        conjunto.adicionarPalavra("Fofo");
        conjunto.adicionarPalavra("Cabeça");

        conjunto.exibirPalavrasUnicas();

        conjunto.removerPalavra("Fofo");

        conjunto.exibirPalavrasUnicas();

        conjunto.verificarPalavra("Cabeça");



    }
}
