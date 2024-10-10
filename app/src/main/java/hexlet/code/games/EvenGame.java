package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    public static final int MAX_NUMBER = 100;

    public static String game() {
        Random random = new Random();

        var randInt = random.nextInt(MAX_NUMBER);

        System.out.println("Question: " + randInt);

        return randInt % 2 == 0 ? "yes" : "no";
    }
}
