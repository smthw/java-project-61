package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    static String correctAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static String game() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();

        var randInt = 0;

        randInt = random.nextInt(100);

        System.out.println("Question: " + randInt);

        return correctAnswer(randInt);
    }
}
