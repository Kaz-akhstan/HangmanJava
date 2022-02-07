import java.io.*;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        gameStarter();
    }
    static void gameStarter()
    {
        /*  -!To Do!-
        *   Slumpade ord
        *   Win-condition
        *   Bättre UI
        */
        String inWord = "hangman";
        char[] word = new char[inWord.length()];
        char[] answer = new char[inWord.length()];
        for(int i = 0; i < inWord.length(); i++)
        {
            word[i] = inWord.charAt(i);
            answer[i] = '-';
        }
        Scanner sc = new Scanner(System.in);
        int difficulty = 7;
        System.out.println(answer);
        mainGame(word, answer, difficulty);
    }
    static void mainGame(char[] word, char[] answer, int difficulty)
    {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
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
                loseLife(difficulty);
            }
            System.out.println(answer);
        }
    }
    static void loseLife(int difficulty)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(difficulty);
        String line;
        File file = new File("man.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            for(int i=0; i<difficulty; i++)
            {
                br.readLine();
            }
            line = br.readLine();
            //line = "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========\n";
            System.out.println(line);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        if(difficulty <= 0)
        {
            System.out.println("GAME OVER!\nPLAY AGAIN?\nY/N");
            if(sc.next().toUpperCase().equals("Y"))
            {
                gameStarter();
            }
            else {
                System.out.println("Thanks For Playing!");
                sc.next();
                System.exit(1);
            }
        }
    }
}
