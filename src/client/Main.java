package client;

import server.mangá;

public class Main {
    public static void main(String [] args) {
        publicarMangá manga = new publicarMangá();
        manga.shounen.send("One Piece", 1041, 102, "Oshida Oda");
        manga.shounen.send("Naruto", 185, 6, "Mashiki Kishimoto");
        manga.shounen.send("Dragon Ball", 200, 10, "Akira Toriama");
        manga.shounen.show();




    }
}
