package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;
import java.util.Arrays;

public class Engine {
    static String runGame(String gameNumber) {
        return switch (gameNumber) {
            case "2" -> EvenGame.game();
            case "3" -> CalcGame.game();
            case "4" -> GcdGame.game();
            case "5" -> ProgressionGame.game();
            case "6" -> PrimeGame.game();
            default -> "";
        };
    }

    static String[] games = {"1", "2", "3", "4", "5", "6"};

    public static void run(String gameNumber) {
        if (gameNumber.equals("1")) {
            Cli.greeting();
            return;
        } else if (gameNumber.equals("0") || !Arrays.asList(games).contains(gameNumber)) {
            return;
        }

        var userName = Cli.greeting();

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
            case "6":
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            default:
                return;
        }

        var userAnswer = "";
        var correctAnswer = "";

        var rounds = 3;

        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < rounds; i++) {
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
