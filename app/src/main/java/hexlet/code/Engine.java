package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;
import java.util.Arrays;

public class Engine {
    static String runGame(String gameNumber) {
        return switch (gameNumber) {
            case "2" -> EvenGame.game();
            case "3" -> CalcGame.game();
            case "4" -> GcdGame.game();
            case "5" -> ProgressionGame.game();
            default -> "";
        };
    }

    public static void run(String gameNumber) {
        if (gameNumber.equals("1")) {
            Cli.greeting();
            return;
        } else if (gameNumber.equals("0") || !Arrays.asList(App.games).contains(gameNumber)) {
            return;
        }

        switch (gameNumber) {
            case "2":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                System.out.println("What is the result of the expression?");
                break;
            case "4":
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case "5":
                System.out.println("What number is missing in the progression?");
                break;
            default:
                return;
        }

        var userName = Cli.greeting();

        var userAnswer = "";
        var correctAnswer = "";

        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < 3; i++) {
            correctAnswer = runGame(gameNumber);

            System.out.print("Your answer: ");

            userAnswer = scanner.next();

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
