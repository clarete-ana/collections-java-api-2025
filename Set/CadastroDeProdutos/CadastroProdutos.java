package Set.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade, long cod){
        produtos.add(new Produto(nome, preco, quantidade,cod));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        System.out.println(cadastroProdutos.produtos);

        cadastroProdutos.adicionarProduto("Produto 5", 15d,5,2L);
        cadastroProdutos.adicionarProduto("Produto 3", 10d,2,1L);
        cadastroProdutos.adicionarProduto("Produto 9", 2d,2,9L);
        cadastroProdutos.adicionarProduto("Manga",14d,3,5L);
        cadastroProdutos.adicionarProduto("Produto novo aaaa ",20d, 10,1L);


        System.out.println(cadastroProdutos.produtos);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }
}
