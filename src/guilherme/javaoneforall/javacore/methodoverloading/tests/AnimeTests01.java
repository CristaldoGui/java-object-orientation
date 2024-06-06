package guilherme.javaoneforall.javacore.methodoverloading.tests;

import guilherme.javaoneforall.javacore.methodoverloading.domain.Anime;

public class AnimeTests01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Dragon Ball", "TV", 200, "Finalized");

        anime.print();
    }
}
