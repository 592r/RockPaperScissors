import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws InterruptedException {

        boolean playAgain = true;

        System.out.println("Hello welcome to rock paper scissors");

        while (playAgain) {

            Scanner myScanner = new Scanner(System.in);
            Scanner playOnScanner = new Scanner(System.in);
            Scanner charlieScanner = new Scanner(System.in);
            Scanner coolScanner = new Scanner(System.in);

            String choice = "";
            String[] hands = {"Rock", "Paper", "Scissors"};

            System.out.println("Would you like to pick scissors paper or rock?");
            System.out.println("1 - rock");
            System.out.println("2 - paper");
            System.out.println("3 - scissors");
            System.out.println("");

            choice = charlieScanner.nextLine();
            System.out.print("You chose ");
            System.out.print(hands[Integer.parseInt(choice)-1]);

            int computerChoice;

            if((choice.equals("1"))||(choice.equals("2"))||(choice.equals("3"))) {

                Random mysteriousObject = new Random();

                computerChoice = mysteriousObject.nextInt(3)+1;

                System.out.println("");
                System.out.print("Waiting for Computer to choose ");
                System.out.print(".");
                Thread.sleep(1000); //pauses the program for one second
                System.out.print(".");
                Thread.sleep(1000); //pauses the program for one second
                System.out.print(".");
                Thread.sleep(1000); //pauses the program for one second
                System.out.println("");

                System.out.println("Computer chose   " + hands[computerChoice-1]);
                
                // TODO decide who wins

                switch (computerChoice){
                    case 1:

                        //computer chose rock
                        if (choice.equals("1"))
                            System.out.println("Draw");
                        else if (choice.equals("2"))
                            System.out.println("You win!");
                        else if (choice.equals("3"))
                            System.out.println("You lose!");
                        break;

                    case 2:

                        //computer chose Paper
                         if (choice.equals("1"))
                            System.out.println("You lose!");
                        else if (choice.equals("2"))
                            System.out.println("Draw");
                        else if (choice.equals("3"))
                            System.out.println("You win!");
                        
                        break;

                    case 3:

                        //computer chose Scissors
                        if (choice.equals("1"))
                            System.out.println("You win!");
                        else if (choice.equals("2"))
                            System.out.println("You lose!");
                        else if (choice.equals("3"))
                            System.out.println("Draw");

                        break;
                }

                // TODO announce the winner

                // TODO ask if they want to play again
                String keepPlaying = "";
                
                System.out.println("Type \"y\" to play again or \"n\" to stop");
                keepPlaying = playOnScanner.nextLine();
                if (keepPlaying.equals("n"))
                    playAgain = false;
                
            }
        }
    }
}
