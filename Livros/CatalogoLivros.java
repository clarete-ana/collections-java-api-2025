package Livros;

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

    public List<Livro> getLivros(){
        return livroList;
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

        catalogo.adicionarLivro("Harry Potter", "J.K. Rowling" , 1997);
        catalogo.adicionarLivro("O Morro dos ventos uivantes", "Emily Brontë",1847);
        catalogo.adicionarLivro("Os irmãos Karamazov", "Fiódor Dostoiévski",1880);

        catalogo.listarCatalogo();


    }



}
