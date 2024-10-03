package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    static String correctAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void game() {
        var userName = Cli.greeting();

        Random random = new Random();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);

        var userAnswer = "";
        var randInt = 0;
        var correctAnswer = "";

        for (var i = 0; i < 3; i++) {
            randInt = random.nextInt(100);

            System.out.println("Question: " + randInt);

            System.out.print("Your answer: ");

            userAnswer = scanner.next();

            correctAnswer = correctAnswer(randInt);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + "Correct answer was '" + correctAnswer + "'.");

                System.out.println("Let's try again, " + userName + "!");

                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
