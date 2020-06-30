package tugas;

import javax.xml.namespace.QName;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();


        player1.speed = 68;
        player1.atk = 100;
        player1.defense = 148;
        player1.health = 500;
        player1.mana = 50;
        player1.name = "Anto";
        player1.job = "Assassins";

        player1.createPlayer();
        player1.status("--------------------");
        player1.run();
        player1.skill();
        player1.attack("Basic", 50);
        player1.getAtk(500);


        if(player1.isDead()){
            System.out.println("☠☠☠ YOU DIED ☠☠☠");
            System.out.println("Game Over!");
        }


        Player p = new Player("anto","yanto");

        PlayerLain Player = new PlayerLain();

        Player.createPlayer();
    }
}
