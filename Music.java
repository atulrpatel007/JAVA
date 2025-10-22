import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        String filePath = "src" + File.separator + "Audio.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = PLAY");
                System.out.println("S = STOP");
                System.out.println("R = RESET");
                System.out.println("Q = QUIT");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }

            System.out.println("No problem detected");

        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("BYE !");
        }
    }
}
