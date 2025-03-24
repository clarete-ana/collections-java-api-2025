package List.Pessoas.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for ( Livro l: livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial , int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public void listarCatalogo(){
        if (livroList.isEmpty()){
            System.out.println("Não há livros no catálogo.");
        }else{
            for (Livro livro: livroList) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1" , 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));


    }



}
