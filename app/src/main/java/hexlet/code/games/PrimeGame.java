package hexlet.code.games;

import java.util.Random;

public class PrimeGame {
    public static String game() {
        Random random = new Random();

        var n = 100;

        var randInt = random.nextInt(n);

        System.out.println("Question: " + randInt);

        for (var i = 2; i <= randInt / 2; i++) {
            if (randInt % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
