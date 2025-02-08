package hexlet.code;

import java.util.Random;

public class Utils {
    static final Random RANDOM = new Random();

    public static int randomNumber(int num) {
        return RANDOM.nextInt(1, num);
    }

    public static int randomNumber() {
        return randomNumber(10);
    }
}
