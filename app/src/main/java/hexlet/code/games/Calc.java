package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    static final String EVEN_DESCRIPTION = "What is the result of the expression?";
    static final String[] SIGNS = {"+", "-", "*"};
    public static String calcResult(String sign, int value1, int value2) {
        switch (sign) {
            case "+":
                return Integer.toString(value1 + value2);
            case "-":
                return Integer.toString(value1 - value2);
            case "*":
                String toString = Integer.toString(value1 * value2);
                return toString;
            default:
                break;
        }
        return sign;
    }
    public static void startCalcGame() {
        String[][] questionsAnswer = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value1 = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            int value2 = Utils.generateRandomNumber(Utils.MAX_NUMBER);
            String signRandom = SIGNS[Utils.generateRandomNumber(SIGNS.length)];
            questionsAnswer[i][0] = value1 + " " + signRandom + " " + value2;
            questionsAnswer[i][1] = calcResult(signRandom, value1, value2);
        }
        Engine.goGame(EVEN_DESCRIPTION, questionsAnswer);
    }
}
