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
        String[] questions = new String[Engine.ROUNDS];
        String[] rightAnswer = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int value1 = Utils.generateRandomNumber(0, 101);
            int value2 = Utils.generateRandomNumber(0, 101);
            String signRandom = SIGNS[Utils.generateRandomNumber(SIGNS.length)];
            questions[i] = value1 + " " + signRandom + " " + value2;
            rightAnswer[i] = calcResult(signRandom, value1, value2);
        }
        Engine.goGame(EVEN_DESCRIPTION, questions, rightAnswer);
    }
}