package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.util.ResourceBundle;

public class App {
    public static void main(String[] args) {
        try {

            String titre = ResourceBundle.getBundle("application").getString("titre");
            String asciiArt1 = FigletFont.convertOneLine(titre);
            System.out.println(asciiArt1);

            String environnement = ResourceBundle.getBundle("application").getString
                    ("environnement");
            System.out.println("Environnement : " + environnement);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}