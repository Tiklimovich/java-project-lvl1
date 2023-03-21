package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final String EVEN_DESCRIPTIONS = "What number is missing in the progression?";
    static final int MIN_LENGTH_OF_PROGRESSION = 5;
    static final int MAX_LENGTH_OF_PROGRESSION = 10;
    static final int MAX_STEP = 10;
    public static String[] progression(int value1, int step, int lengthOfProgression) {
        int[] result = new int[lengthOfProgression];
        for (var i = 0; i < lengthOfProgression; i++) {
            result[i] = value1 + (step * i);
        }
        String[] numbersAsString = new String[lengthOfProgression];
        for (var i = 0; i < result.length; i++) {
            for (var j = 0; j < numbersAsString.length; j++) {
                numbersAsString[j] = String.valueOf(result[i]);
                i++;
            }
        }
        return numbersAsString;
    }

    public static void startProgressionsGame() {
        System.out.println();
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstValue = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            int step = Utils.generateRandomNumber(MAX_STEP);
            int lengthOfProgression = Utils.generateRandomNumber(MIN_LENGTH_OF_PROGRESSION, MAX_LENGTH_OF_PROGRESSION);
            int index = Utils.generateRandomNumber(lengthOfProgression);
            String[] values = progression(firstValue, step, lengthOfProgression);
            String answer = values[index];
            values[index] = "..";
            String question = String.join(" ", values);

            questionsAnswer[i][0] = question;
            questionsAnswer[i][1] = answer;
        }
        Engine.goGame(EVEN_DESCRIPTIONS, questionsAnswer);
    }
}
