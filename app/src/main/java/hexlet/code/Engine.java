package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static void goGame(String rules, String[][] questionsAnswer) {
        String userName = Cli.greet();

        System.out.println(rules);

        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAnswer[i][0]);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if (answer.equals(questionsAnswer[i][1])) {
                System.out.println("Correct!");
            } else if (!answer.equals(questionsAnswer[i][1])) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was"
                        + "'" + questionsAnswer[i][1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}


