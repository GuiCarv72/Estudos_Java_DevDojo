package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

import javax.swing.*;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball","TV","Ação",12 ,"Produtor IG");
        anime.imprime();
    }
}
