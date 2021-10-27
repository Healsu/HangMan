import java.util.Scanner;

public class Hangman{

    //We have these two private Strings which purpose is to pick a random word from the ReadMe file, given in the folder
    private String wordHidden = FileRead.makeWords().get((int) (Math.random() * FileRead.makeWords().size()));
    //While this ones purpose is to hide the string with "_" so the player cant cheat and just see the word
    //they are suppose to guessl
    private String asterisk = new String(new char[wordHidden.length()]).replace("\0", "_");

    //Counter for amount of fails
    private static int counter = 0;
    //Scanner for later
    private static Scanner scanner = new Scanner(System.in);

    //This is where we want the game itself to start after being called in the main
    public void playGame(){
        //while loop to check if counter is below 6 and if there is still a word that haven't been revealed yet.
        while (counter < 6 && asterisk.contains("_")) {
            System.out.println("Guess any letter in the word");
            System.out.println(asterisk);

            //Ask the player for guess input
            String playerInput = scanner.next();

            //We proceed to where the word will be checked
            hangman(playerInput);
        }
    }
    public void hangman(String playerInput){
        //Here we make a new check that will compare itself with the player input.
        String checkPlayerInput = "";
        for (int i = 0; i < wordHidden.length(); i++) {

            //If playerInputs index at 0 is the same as one of the letters that is hidden in the word, will the checked word become
            //the player input
            if (wordHidden.charAt(i) == playerInput.charAt(0)) {
                //The checkPlayerInput will get the playerInput that was written at index 0 (AKA so simplify if i write)
                //hello, it will only take h to replace it.
                checkPlayerInput += playerInput.charAt(0);
            } else if (asterisk.charAt(i) != '_') {
                checkPlayerInput += wordHidden.charAt(i);
            } else {
                checkPlayerInput += "_";
            }
        }
      //This is where the checkPlayerInput will be compared to the actual result
      checkGuess(checkPlayerInput);

    }
    public void checkGuess(String checkPlayerInput){

        //If the checkedPlayerInput should be the same as asterisk, it will result being wrong and a point will go to the counter
        //And if this counter should reach 6, the player loses
        if (asterisk.equals(checkPlayerInput)) {
            counter++;
            System.out.println("Wrong guess;" +
                    " \nTotal number of wrong guesses: "+ counter);
            playerFail();
        } else {
            //Else it will replace the asterisk shown in the console with the word
            asterisk = checkPlayerInput;

        }
        if (asterisk.equals(wordHidden)) {
            //If it so should happen that all words have been revealed the game will stop and the player will win
            System.out.println("Correct! You win! The word was " + wordHidden);
        }
        if(counter >= 6){
            System.out.println("You guessed 6 times, you lose");

        }
    }

    //Extra illustration to gamify more this program with visuals.
    public static void playerFail(){
        System.out.println("What the dog doing tho? ");


        }
    }

