import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    private static String getRandomMove() {
        String move = "";

        Random random = new Random();
        int randomNumber = random.nextInt(3);
        switch (randomNumber) {
            case 0:
                move = "R";
                break;
            case 1:
                move = "P";
                break;
            case 2:
                move = "S";
                break;
            default:
                System.out.println("Error");
                break;
        }

        return move;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors game!\n");

        System.out.println("To play, type R for Rock, P for Paper, or S for Scissors");
        System.out.println("The computer will play a random move, if the move is the same, it will be a tie\n");

        System.out.println("Good luck!\n");


        String move = "";

        do {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Your move: ");
            try {
                move = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!(move.equals("R") || move.equals("P") || move.equals("S")));

        String computerMove = getRandomMove();

        System.out.println("The computer played " + computerMove + "\n");

        if (move.equals(computerMove)) {
            System.out.println("It's a tie!");
        }
        else if (move.equals("R") && computerMove.equals("S") || move.equals("P") && computerMove.equals("R") || move.equals("S") && computerMove.equals("P")) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }

        System.exit(0);
    }
}