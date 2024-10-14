package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAX_ROUNDS_OF_GAME = 3;
    public static final int QA_FOR_ONE_ROUND = 2;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static int randomNumber(int num) {
        Random random = new Random();

        return random.nextInt(num);
    }
}
