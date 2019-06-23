import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        System.out.println("Welcome the the Rock Paper Scissors game");

        /** This is a simple Rock Paper Scissor game.
         *  Rules are as follows:
         *  You can pick between Rock, Paper and Scissors
         *  Rock beats Scissors,
         *  Scissors beats Paper,
         *  And Paper beats Rock
         *  The Opponent - in this case, TheComputer will be assigned a random choice
         *  If you choose the same this the game will end in a draw         *
        */

        Random random = new Random();
        int computerWeapon = random.nextInt(3);
//        int computerWeapon = 2;
        System.out.println("Computer weapon is: "+ computerWeapon);

        System.out.println("Choose your weapon:");
        System.out.println("0 = Rock ; 1 = Paper; 2 = Scissors;");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your choice");

        int playerWeapon = myScanner.nextInt();
//        System.out.println("You chose " + playerWeapon);

        if(playerWeapon == 0)
            System.out.println( "You chose Rock");
        else if(playerWeapon == 1)
            System.out.println("You chose Paper");
        else if(playerWeapon == 2)
            System.out.println( "You chose Scissors");

        if(playerWeapon < 0 || playerWeapon > 2){
            System.out.println("You lost! Next time pick something better!");
            System.exit(0);
        }

        if(playerWeapon == computerWeapon){
            System.out.println("It's a draw!");
            System.exit(0);
        }
////
         if(playerWeapon == 0){
             if(computerWeapon ==1){
                 System.out.println("You chose Rock, Computer chose Paper, Computer wins!");
             }
             else System.out.println("You chose Rock, Computer chose Scissors, You win!");
         }
         else if(playerWeapon == 1){
             if(computerWeapon == 0){
                 System.out.println("You chose Paper, Computer chose rock. You win!");
             }
             else System.out.println("You chose Paper, Computer chose Scissors. Computer wins!");
         }
         else {
             if (computerWeapon == 0){
                 System.out.println("You chose Scissors, Computer chose rock. Computer wins!");
             }
             else System.out.println("You chose Scissors, Computer chose Paper. You win!");
         }
    }
}
