package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void goGame(String rules, String[] questions, String[] rightAnswer) {
        String userName = Cli.greet();

        System.out.println(rules);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(rightAnswer[i])) {
                System.out.println("Correct!");
            } else if (!answer.equals(rightAnswer[i])) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was"
                        + "'" + rightAnswer[i] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}


