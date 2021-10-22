import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the game");
        System.out.println("In this game we will provide you with a random hidden word, and your " +
                "task is to guess it with a limited amount of tries: ");

        System.out.println("\nNow do you want to play on hard mode or easy mode: ");
        String playerDiff = scanner.nextLine();

        FileRead.makeWords();


        Hangman.playGame();




    }
}

