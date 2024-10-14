package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String[][] questionsAnswers, String gameRules) {
        var userName = Cli.greeting();

        System.out.println(gameRules);

        var userAnswer = "";
        var correctAnswer = "";

        Scanner scanner = new Scanner(System.in);

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            System.out.println(questionsAnswers[i][Utils.QUESTION_INDEX]);

            System.out.print("Your answer: ");

            userAnswer = scanner.next();
            correctAnswer = questionsAnswers[i][Utils.ANSWER_INDEX];

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
