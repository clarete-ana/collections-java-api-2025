package List.Pessoas.carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }

        carrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){

        Double valorTotal= 0.0;

        for (Item i : carrinho){
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Azeitona",20.65,1);
        carrinho.adicionarItem("Arroz",35.60,1);
        carrinho.adicionarItem("Feijão", 5.65,1);

        carrinho.exibirItens();

        System.out.println("Valor total : " + carrinho.calcularValorTotal());
    }
}
