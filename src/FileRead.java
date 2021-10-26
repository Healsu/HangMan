import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileRead {
    public static ArrayList<String> makeWords() {
        ArrayList<String> hangmanWord = new ArrayList<String>();
        try {
            File file = new File("src/ReadMe");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                hangmanWord.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
        return hangmanWord;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Extra feature (Beta hard mode)
public static ArrayList<String> makeWordsHard() {
    ArrayList<String> hangmanWord = new ArrayList<String>();
    try {
        File file = new File("src/ReadMeHard");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            hangmanWord.add(scanner.nextLine());
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found");

    }
    return hangmanWord;
}

}
