package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
public class Prime {
    static final String EVEN_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String primeResult(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void startPrimeGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] rightAnswer = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            questions[i] = Integer.toString(value);
            rightAnswer[i] = primeResult(value);
        }
        Engine.goGame(EVEN_DESCRIPTION, questions, rightAnswer);
    }
}
