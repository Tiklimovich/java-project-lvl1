package hexlet.code;
import java.util.Scanner;
import hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        Scanner initialScanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String playerInput = initialScanner.next();
        System.out.println("Your choice: " + playerInput);
        switch (playerInput) {
            case "0":
                break;
            case "1":
                Cli.greet();
            case "2":
                Even.startEvenGame();
        }
    }
}