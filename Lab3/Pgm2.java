package Lab3;


import java.util.*;
import java.util.Random;

class Player {
    int num;

    public void player(int num) {
        this.num = num;
    }}

class Game{
    Random rand = new Random();
    int targetNumber = rand.nextInt(11);
    int n1,n2,n3;

    public void startGame() {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 0-9, Good luck:)");
        System.out.println("Enter guess of player 1:");
        n1 = sc.nextInt();
        System.out.println("Enter guess of player 2:");
        n2 = sc.nextInt();
        System.out.println("Enter guess of player 3:");
        n3 = sc.nextInt();
        Player p1 = new Player();
        p1.player(n1);
        Player p2 = new Player();
        p1.player(n2);
        Player p3 = new Player();
        p1.player(n3);
        sc.close();

    }

    public void checkGame() {
        if (n1 == targetNumber) {
            System.out.println("Player 1 has guessed the right number!");
        } else if (n2 == targetNumber) {
            System.out.println("Player 2 has guess the right number!");
        }

        else if (n3 == targetNumber) {
            System.out.println("Player 3 has guess the right number!");
        } else {
            System.out.println("The correct number was: "+ (targetNumber));
            System.out.println("No player has guessed the correct number:(");
        }
    }

}

public class Pgm2 {
    public static void main(String args[]) {

        Game game = new Game();
        game.startGame();
        game.checkGame();

    }

}
