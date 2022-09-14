package br.com.gft.model;

import br.com.gft.interfaces.Imposto;



public class Livro extends Produto implements Imposto {
    //ATRIBUTOS
    private String autor;
    private String tema;
    private int qdtPag;


    //METODOS
    public Livro() {}

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qdtPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qdtPag = qdtPag;
    }

    //GETTERS

    public String getAutor() {
        return autor;
    }
    public String getTema() {
        return tema;
    }

    public int getQdtPag() {
        return qdtPag;
    }


    //SETTERS

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQdtPag(int qdtPag) {
        this.qdtPag = qdtPag;
    }




    @Override
    public String toString() {
        return "Titulo: " + nome + '\'' +
                ", preco: " + preco +
                ", quantidade: " + qtd;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        if (tema != "educativo") {
            imposto = preco * 0.1d;
            System.out.println("R$ " + imposto + " de imposto sobre o livro " + getNome());
        }
        else {
            imposto = 1;
            System.out.println("Livro educativo nao possui imposto: " + getNome());
        }
        return imposto;
    }
}
