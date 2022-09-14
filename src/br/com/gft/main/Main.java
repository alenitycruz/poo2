package br.com.gft.main;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livro = new ArrayList<>();
        Livro l1 = new Livro("Harry Potter", 40d, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Aneis", 60d, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20d, 50, "GFT", "educativo", 500);

        livro.add(l1);
        livro.add(l2);
        livro.add(l3);

        List<VideoGame> games = new ArrayList<>();
        VideoGame ps4 = new VideoGame("PS4", 1800d, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000d, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500d, 500, "Microsoft", "One", false);

        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livro, games);

        l2.calculaImposto();
        l3.calculaImposto();

        ps4Usado.calculaImposto();
        ps4.calculaImposto();

        System.out.println(l2.calculaImposto());
        System.out.println(l3.calculaImposto());
        System.out.println(ps4Usado.calculaImposto());
        System.out.println(ps4.calculaImposto());
        System.out.println("---------------------------------------");
        System.out.println("A loja Americanas possui estes livros para venda: ");
        americanas.listaLivros();
        System.out.println("---------------------------------------");
        System.out.println("A loja Americanas possui estes video-games para venda: ");
        americanas.listaVideoGames();
        System.out.println("---------------------------------------");
        americanas.calculaPatrimonio();
    }
}
