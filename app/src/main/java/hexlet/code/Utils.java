package hexlet.code;

import java.util.Random;

public class Utils {
    static final Random RANDOM = new Random();

    static final int DEFAULT_VAL_FOR_RANDOM = 10;

    public static int randomNumber(int num) {
        return RANDOM.nextInt(1, num);
    }

    public static int randomNumber() {
        return randomNumber(DEFAULT_VAL_FOR_RANDOM);
    }
}
