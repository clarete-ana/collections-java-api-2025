package Map.Ordenacao;

import java.util.Collection;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento: " +
                nome + '\'' +
                ", atracao: '" + atracao + '\'' ;
    }
}
