import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\Lenovo\\OneDrive\\Documents\\codes\\java\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        if (words.isEmpty()) {
            System.out.println("The word list is empty.");
            return;
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size())).toLowerCase();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;
        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }
        System.out.println("""
                *******************************
                    Welcome To Hangman Game
                *******************************""");
        while (wrongGuesses < 6) {
            System.out.println(getHangmanArt(wrongGuesses));
            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (word.indexOf(guess) >= 0) {
                boolean alreadyRevealed = false;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        if (wordState.get(i) != guess) {
                            wordState.set(i, guess);
                        } else {
                            alreadyRevealed = true;
                        }
                    }
                }
                if (!alreadyRevealed) {
                    System.out.println("Correct Guess!");
                } else {
                    System.out.println("You already guessed that letter.");
                }
                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("🎉 You Win!");
                    System.out.println("The word was: " + word);
                    break;
                }
            } else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }
            if (wrongGuesses >= 6) {
                System.out.println(getHangmanArt(wrongGuesses));
                System.out.println("💀 Game Over");
                System.out.println("The word was: " + word);
            }
        }
        scanner.close();
    }
    static String getHangmanArt(int wrongGuess) {
        return switch (wrongGuess) {
            case 0 -> """
                    
                    
                    
                    """;
            case 1 -> """
                     O
                    
                    
                    """;
            case 2 -> """
                     O
                     |
                    
                    """;
            case 3 -> """
                     O
                    /|
                    
                    """;
            case 4 -> """
                     O
                    /|\\
                    
                    """;
            case 5 -> """
                     O
                    /|\\
                    /
                    """;
            case 6 -> """
                     O
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    }
}
