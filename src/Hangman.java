import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws IOException {
        gameStarter();
    }
    static void gameStarter() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("wordList.txt"));
        Random r = new Random();
        for (int i = 0; i<r.nextInt(851); i++)
        {
            br.readLine();
        }
        String inWord = br.readLine();
        char[] word = new char[inWord.length()];
        char[] answer = new char[inWord.length()];
        for(int i = 0; i < inWord.length(); i++)
        {
            word[i] = inWord.charAt(i);
            answer[i] = '-';
        }
        int difficulty = 7;
        System.out.println(answer);
        mainGame(word, answer, difficulty);
    }
    static void mainGame(char[] word, char[] answer, int difficulty) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            if(Arrays.equals(word, answer))
            {
                System.out.println("The word: " + Arrays.toString(answer).replaceAll(", ", "") + " has been revealed! You Win!");
                System.out.println("Your score was " + difficulty);
                gameOver();
                break;
            }
            boolean charFound = false;
            char guess = sc.next().toLowerCase().charAt(0);
            for(int i = 0; i < word.length; i++)
            {
                if(guess == word[i])
                {
                    answer[i] = guess;
                    charFound = true;
                }
            }
            if(!charFound)
            {
                difficulty--;
                drawImage(difficulty, word);
            }
            System.out.println(answer);
        }
    }
    static void drawImage(int difficulty, char[] word) throws IOException {
        System.out.println(difficulty);
        switch (difficulty)
        {
            case 6:
                System.out.println("  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========\n");
                break;
            case 5:
                System.out.println("  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========\n");
                break;
            case 4:
                System.out.println("  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========\n");
                break;
            case 3:
                System.out.println("  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========\n");
                break;
            case 2:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========\n");
                break;
            case 1:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========\n");
                break;
            case 0:
                System.out.println("  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========\n");
                System.out.println("The word was: " + Arrays.toString(word).replaceAll(", ", ""));
                System.out.println("GAME OVER!");
                gameOver();
        }
    }
    static void gameOver() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLAY AGAIN?\nY/N");
        if(sc.next().equalsIgnoreCase("Y"))
        {
            gameStarter();
        }
        else {
            System.out.println("Thanks For Playing!");
            sc.next();
            System.exit(0);
        }
    }
}
