package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Gcd {
    static final String EVEN_DESCRIPTIONS = "Find the greatest common divisor of given numbers.";

    public static String gcdResult(int value1, int value2) {
        int gcd = 1;
        for (int j = 1; j <= value1 && j <= value2; j++) {
            if (value1 % j == 0 && value2 % j == 0) {
                gcd = j;
            }
        }
        return Integer.toString(gcd);
    }

    public static void startGcdGame() {
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value1 = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            int value2 = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            questionsAnswer[i][0] = value1 + " " + value2;
            questionsAnswer[i][1] = gcdResult(value1, value2);
        }
        Engine.goGame(EVEN_DESCRIPTIONS, questionsAnswer);
    }
}
