package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Even {
    static final String EVEN_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startEvenGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] rightAnswer = new String[Engine.ROUNDS];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value = Utils.generateRandomNumber(0, 101);
            questions[i] = Integer.toString(value);
            rightAnswer[i] = (value % 2 == 0) ? "yes" : "no";
        }
        Engine.goGame(EVEN_DESCRIPTION, questions, rightAnswer);
    }
}
