import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game");
        System.out.println("In this game we will provide you with a random hidden word, and your " +
                "task is to guess it with a limited amount of tries (6): ");

        System.out.println("\nSince i cant make hard mode work, just write something and lets go with easy mode: ");
        String playerDiff = scanner.nextLine();

        String bla = "\\";
                Hangman CreateGame = new Hangman();
                CreateGame.playGame();
    }
}
        //Extra Notes - Background Information//
//My main intend was to try and keep myself limited to 2-3 classes, and not make a entire new class just for hardmode
//Didnt work tho

