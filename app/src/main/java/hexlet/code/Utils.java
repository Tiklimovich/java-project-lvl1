package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAX_NUMBER = 100;
    static final Random RANDOM = new Random();

    public static int generateRandomNumber(int min, int max) {
        int range = max - min;
        return min + RANDOM.nextInt(range);
    }
    public static int generateRandomNumber(int max) {
        return generateRandomNumber(0, max);
    }
}