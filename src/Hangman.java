import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        /*Hämta slumpat ord från fil*/
        String inWord = "hangman";
        char[] word = new char[inWord.length()];
        char[] answer = new char[inWord.length()];
        for(int i = 0; i < inWord.length(); i++)
        {
            word[i] = inWord.charAt(i);
            answer[i] = '-';
        }
        Scanner sc = new Scanner(System.in);
        int difficulty = sc.nextInt();
        boolean playingGame = true;//Hitta bättre lösning
        mainGame(word, answer, difficulty, playingGame);
    }
    static void mainGame(char[] word, char[] answer, int difficulty, boolean playingGame)
    {
        Scanner sc = new Scanner(System.in);
        while (playingGame)
        {
            boolean charFound = false;
            char guess = sc.next().charAt(0);
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
                if(!loseLife(difficulty, playingGame))
                {
                    playingGame = false;
                }
            }
            System.out.println(answer);
        }
    }
    static boolean loseLife(int difficulty, boolean playingGame)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(difficulty);
        if(difficulty <= 0)
        {
            System.out.println("GAME OVER!\nPLAY AGAIN?\nY/N");
            if(sc.nextLine().equals("Y"))
            {
                playingGame = false;//Hitta bättre lösning
            }
            /*Tillbaka till start menyn*/
        }
        return playingGame;
    }
}
