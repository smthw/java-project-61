package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static final int MAX_NUMBER = 100;

    public static String game() {
        Random random = new Random();

        var randInt = random.nextInt(MAX_NUMBER);

        System.out.println("Question: " + randInt);

        for (var i = 2; i <= randInt / 2; i++) {
            if (randInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
