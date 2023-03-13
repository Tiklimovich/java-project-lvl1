package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    static final String EVEN_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static boolean evenResult(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void startEvenGame() {
        System.out.println();
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            questionsAnswer[i][0] = Integer.toString(value);
            questionsAnswer[i][1] = evenResult(value) ? "yes" : "no";
        }
        Engine.goGame(EVEN_DESCRIPTION, questionsAnswer);
    }
}
