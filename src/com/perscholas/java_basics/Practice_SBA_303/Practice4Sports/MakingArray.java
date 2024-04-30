package com.perscholas.java_basics.Practice_SBA_303.Practice4Sports;

import java.util.Arrays;

public class MakingArray {
    public static void main(String[] args) {
        Player[] players = new Player[11];

        Player emaniBarnes = new Player("Emani", "Barnes", "QB", 27, 6.5, 237, 7, "Wyoming", 6, "Buffalo Bills");
        Player damianMcBride = new Player("Damian", "McBride", "QB", 26, 6, 210, 3, "SMU", 2, "Miami Dolphins");
        Player kelseyGuerra = new Player("Kelsey", "Guerra", "QB", 29, 6.3, 222, 8, "North Carolina", 4, "New England Patriots");
        Player lelandBurnett = new Player("Leland", "Burnett", "RB", 24, 5.11, 190, 3, "Georgia", 9, "New York Jets");
        Player emberlyHayden = new Player("Emberly", "Hayden", "RB", 24, 5.11, 216, 3, "Kentucky", 2, "Buffalo Bills");
        Player leroyPerez = new Player("Leroy", "Perez", "RB", 25, 5.11, 203, 8, "Appalachian State", 4, "Miami Dolphins");
        Player eleanorDunn = new Player("Eleanor", "Dunn", "RB", 26, 5.11, 210, 3, "Maryland", 2, "New England Patriots");
        Player dawsonConnor = new Player("Dawson", "Connor", "FB", 26, 6, 244, 5, "Toledo", 8, "New York Jets");
        Player charliNunez = new Player("Charli", "Nunez", "WR", 20, 6.4, 215, 3, "Florida State", 4, "Buffalo Bills");
        Player cadenVasquez = new Player("Caden", "Vasquez", "WR", 24, 5.9, 178, 8, "Penn State", 7, "Miami Dolphins");
        Player journeeMcann = new Player("Journee", "McCann", "WR", 30, 6.4, 221, 3, "North Carolina", 9, "New England Patriots");

        players[0] = emaniBarnes;
        players[1] = damianMcBride;
        players[2] = kelseyGuerra;
        players[3] = lelandBurnett;
        players[4] = emberlyHayden;
        players[5] = leroyPerez;
        players[6] = eleanorDunn;
        players[7] = dawsonConnor;
        players[8] = charliNunez;
        players[9] = cadenVasquez;
        players[10] = journeeMcann;

        for (Player player : players) {
            System.out.println(player.toString());
        }
    }

}
