package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;
import java.util.Arrays;

public class Engine {
    static String runGame(String gameNumber) {
        switch (gameNumber) {
            case "2":
                return EvenGame.game();
            case "3":
                return CalcGame.game();
            case "4":
                return GcdGame.game();
            default:
                return "";
        }
    }

    public static void main(String gameNumber) {
        if (gameNumber.equals("1")) {
            Cli.greeting();
            return;
        } else if (gameNumber.equals("0") || !Arrays.asList(App.games).contains(gameNumber)) {
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
