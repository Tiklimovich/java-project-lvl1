package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    static final String EVEN_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean primeResult(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void startPrimeGame() {
        System.out.println();
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value = Utils.generateRandomNumber(2, Utils.MAX_NUMBER);
            questionsAnswer[i][0] = Integer.toString(value);
            questionsAnswer[i][1] = primeResult(value) ? "yes" : "no";
        }
        Engine.goGame(EVEN_DESCRIPTION, questionsAnswer);
    }
}

