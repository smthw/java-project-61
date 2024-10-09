package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static String game() {
        Random random = new Random();

        var randInt = random.nextInt(100);

        System.out.println("Question: " + randInt);

        for (var i = 2; i <= randInt / 2; i++) {
            if (randInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
