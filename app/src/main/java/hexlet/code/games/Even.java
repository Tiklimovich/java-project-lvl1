package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    static final String EVEN_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String evenResult(int value) {
        if (value % 2 == 0) {
            return "yes";
        }
        return "no";
    }
    public static void startEvenGame() {
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            questionsAnswer[i][0] = Integer.toString(value);
            questionsAnswer[i][1] = evenResult(value);
        }
        Engine.goGame(EVEN_DESCRIPTION, questionsAnswer);
    }
}
