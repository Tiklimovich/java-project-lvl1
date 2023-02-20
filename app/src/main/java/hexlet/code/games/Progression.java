package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String EVEN_DESCRIPTIONS = "What number is missing in the progression?";
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    public static void startProgressionGame() {
        String[] questions = new String[Engine.ROUNDS];
        String[] rightAnswer = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int lengthOfProgression = Utils.generateRandomNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int[] values = new int[lengthOfProgression];
            int step = Utils.generateRandomNumber(1, 10);
            values[0] = Utils.generateRandomNumber(1, 101);
            for (int j = 0; j < values.length; j++) {
                values[j] = values[0] + step * j;
            }
            int answer = Utils.generateRandomNumber(1, lengthOfProgression - 1);
            String question = "";
            for (int l = 0; l < lengthOfProgression; l++) {
                if (l == answer) {
                    question += ".." + " ";
                } else if (l != answer) {
                    question += values[l] + " ";
                }
            }
            questions[i] = question;
            rightAnswer[i] = Integer.toString(values[answer]);
        }
        Engine.goGame(EVEN_DESCRIPTIONS, questions, rightAnswer);
    }
}
