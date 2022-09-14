package br.com.gft.model;

import java.util.List;

public class Loja {
    //ATRIBUTOS
    private String nome;
    private String cnpj;
    private List<Livro> livro;
    private List<VideoGame> games;

    //METODOS
    public void Loja() {}

    public Loja(String nome, String cnpj, List<Livro> livro, List<VideoGame> games) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livro = livro;
        this.games = games;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivro() {
        return livro;
    }

    public List<VideoGame> getGames() {
        return games;
    }


    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivro(List<Livro> livro) {
        this.livro = livro;


    }

    public void setGames(List<VideoGame> games) {
        this.games = games;
    }

    //METODOS
    public void listaLivros() {
        if (livro == null){
            System.out.print("A loja nao tem livros no seu estoque.");
        } else {
            System.out.println(livro);
        }
    }

    public void listaVideoGames() {
        if (games == null) {
            System.out.print("A loja nao tem games no seu estoque.");
        } else {
            System.out.println(games);
        }
    }





    public double calculaPatrimonio() {
        double totalPatrimonioLivro = 0.0;
        double totalPatrimonioGame = 0.0;

            for (Livro li : getLivro()) {
                totalPatrimonioLivro += (li.getPreco() + li.calculaImposto()) * li.getQtd();
                System.out.println(li.getQtd());
            }


            for (VideoGame vg: getGames()) {
                totalPatrimonioGame += (vg.getPreco() + vg.calculaImposto()) * vg.getQtd();
            }


        double totalPatrimonio = totalPatrimonioLivro + totalPatrimonioGame;
        System.out.println("O patrimonio da loja: " + this.getNome() + " e de R$ " + totalPatrimonio);
        return totalPatrimonio;
    }


}
