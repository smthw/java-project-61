package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    public static String game() {
        Random random = new Random();

        var randInt = random.nextInt(100);

        System.out.println("Question: " + randInt);

        return randInt % 2 == 0 ? "yes" : "no";
    }
}
