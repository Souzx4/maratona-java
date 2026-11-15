package maratonajava.Construtores.Test;

import maratonajava.Construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime a = new Anime("test", "wq", 21, "sw", "producao");
        a.imprimirAnime();
    }
}
