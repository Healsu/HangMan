import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game");
        System.out.println("In this game we will provide you with a random hidden word, and your " +
                "task is to guess it with a limited amount of tries: ");

        System.out.println("\nSince i cant make hard mode work, write easy so we can get going: ");
        String playerDiff = scanner.nextLine();

            if(playerDiff.equalsIgnoreCase("easy")) {
                Hangman CreateGame = new Hangman();
                CreateGame.playGame();
            }
            /*else if(playerDiff.equalsIgnoreCase("hard")){
                Hangman CreateGame = new Hangman(FileRead.diffPlayer()[3],FileRead.diffPlayer()[4]);
                CreateGame.playGame();
            }

             */
            else{
                System.out.println("Dumdum you wrote it wrong");
            }
    }


}

