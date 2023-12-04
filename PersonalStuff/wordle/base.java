package PersonalStuff.wordle;

import java.lang.String;
import java.io.*;
import java.util.*;

public class base {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BACKGROUND_YELLOW = "\u001b[43m";
    public static final String ANSI_BACKGROUND_GREEN = "\u001b[42m";
    public static ArrayList<String> ANSWERS = new ArrayList<String>();
    public static void main(String[] args) {
        try {
            File a = new File("try.txt");
            BufferedReader b = new BufferedReader(new FileReader(a));
            String l = b.readLine();

            while(l != null) {
                ANSWERS.add(l);
                l = b.readLine();
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        int tries = 0;
        String answer = getRandomAnswer();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first guess to start: ");
        String word = in.nextLine().toLowerCase();

        while(!check(word)) {
            System.out.println("Not a valid word! Guess again:");
            word = in.nextLine().toLowerCase();
        }

        char[] charAns;
        char[] charWord;
        boolean x = true;
        while(!word.equals(answer)) {
            charAns = answer.toCharArray();
            charWord = word.toCharArray();
            printColor(charWord, charAns);
            tries++;
            if(tries == 6) {
                System.out.println("The word was " + ANSI_BACKGROUND_GREEN + answer + ANSI_RESET + ".");
                System.out.println("You did not manage to guess the word in 6 tries.");
                x = false;
                break;
            }
            word = in.nextLine();
            while(check(word) == false) {
                word = in.nextLine();
            }
        }
        in.close();

        if(x == true) {
            System.out.println("The word was " + ANSI_BACKGROUND_GREEN + answer + ANSI_RESET + "!");
            System.out.println("Congratulations! You managed to guess the word in " + (tries + 1) + " tries!");
        }
    }

    public static String getRandomAnswer() {
        int index = (int) (Math.random() * ANSWERS.size());
        return ANSWERS.get(index);
    }

    public static boolean check(String word) {
        if(word.matches("^\\d   +(\\.\\d+)?") || word.length() != 5 || !isWord(word))
        {
            return false;
        }
        return true;
    }

    public static boolean isWord(String word) {
        try {
            File file = new File("allowed.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null) {
                if(word.equals(line)) {
                    return true;
                } else {
                    line = br.readLine();
                }
            }

            for(int i = 0; i < ANSWERS.size(); i++) {
                if(word.equals(ANSWERS.get(i))) {
                    return true;
                }
            }
            return false;
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return false;
    }

    public static void printColor(char[] word, char[] answer) {
        int[] colors = {0, 0, 0, 0, 0};

        for(int i = 0; i < 5; i++) {
            if(word[i] == answer[i]) {
                colors[i] = 2;
            }
        }

        for(int j = 0; j < 5; j++) {
            for(int k = 0; k < 5; k++) {
                if(word[j] == answer[k] && colors[j] != 2) {
                    colors[j] = 1;
                }
            }
        }

        for(int n = 0; n < 5; n++) {
            if(colors[n] == 1) {
                System.out.print(ANSI_BACKGROUND_YELLOW + word[n] + ANSI_RESET);
            } else if(colors[n] == 2) {
                System.out.print(ANSI_BACKGROUND_GREEN + word[n] + ANSI_RESET);
            } else {
                System.out.print(word[n]);
            }
        }
        System.out.println();
        System.out.println();
    }
}
