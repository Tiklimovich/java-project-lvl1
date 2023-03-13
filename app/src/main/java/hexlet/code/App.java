package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        Scanner initialScanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String playerInput = initialScanner.next();
        System.out.println("Your choice: " + playerInput);
        switch (playerInput) {
            case "1" -> Cli.greet();
            case "2" -> Even.startEvenGame();
            case "3" -> Calc.startCalcGame();
            case "4" -> Gcd.startGcdGame();
            case "5" -> Progression.startProgressionsGame();
            case "6" -> Prime.startPrimeGame();
            default -> System.out.println("Wrong input");
        }
        System.out.println("Goodbye!");
    }
}
