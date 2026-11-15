package maratonajava.SobreCargaMetodos.Test;

import maratonajava.SobreCargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a = new Anime();
        a.init("Naruto", "TV", 12, "acao");
        a.imprimirAnime();

    }
}
