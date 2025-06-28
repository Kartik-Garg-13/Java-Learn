import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[]args){
        String filepath="C:\\Users\\Lenovo\\OneDrive\\Documents\\codes\\java\\Coke Studio Season 9 Afreen Afreen Rahat Fateh Ali Khan & Momina Mustehsan.wav";
        File file = new File(filepath);
        try (Scanner scanner=new Scanner(System.in);
             AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){
            Clip clip=AudioSystem.getClip();
            clip.open(audiostream);
            clip.start();
            String response = "";
            while (!response.equals("Q")){
                System.out.println("""
                        P: Play
                        S: Stop
                        R: Reset
                        Q: Quit
                        Enter Your Choice: """);
                response=scanner.nextLine().toUpperCase();
                switch (response){
                    case "P"->clip.start();
                    case "S"->clip.stop();
                    case "R"->clip.setMicrosecondPosition(0);
                    case "Q"->clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could Not Locate File");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable To Access Audio Source");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio File Is Not Supported");
        }
        catch (IOException e){
            System.out.println("Something Went Wrong");
        }
        finally {
            System.out.println("Bye");
        }
    }
}
