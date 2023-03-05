package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String EVEN_DESCRIPTIONS = "What number is missing in the progression?";
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    static final int MAX_STEP = 10;
    public static int[] progression(int value1, int step, int lengthOfProgression) {
        int[] result = new int[lengthOfProgression];
        for (int i = 0; i < lengthOfProgression; i++) {
            result[i] = value1 + step * i;
        }
        return result;
    }
    public static void startProgressionsGame() {
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value1 = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            int step = Utils.generateRandomNumber(MAX_STEP);
            int lengthOfProgression = Utils.generateRandomNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int[] values = progression(value1, step, lengthOfProgression);
            int answer = Utils.generateRandomNumber(1, lengthOfProgression - 1);
            String question = "";
            for (int l = 0; l < lengthOfProgression; l++) {
                if (l == answer) {
                    question += ".." + " ";
                } else {
                    question += values[l] + " ";
                }
            }
            questionsAnswer[i][0] = question;
            questionsAnswer[i][1] = Integer.toString(values[answer]);
        }
        Engine.goGame(EVEN_DESCRIPTIONS, questionsAnswer);
    }
}
