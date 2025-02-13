package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int MAX_ROUNDS_OF_GAME = 3;
    public static final int QA_FOR_ONE_ROUND = 2;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void playGame(String[][] questionsAnswers, String gameRules) {
        var userName = Cli.greeting();

        System.out.println(gameRules);

        Scanner scanner = new Scanner(System.in);

        for (var round : questionsAnswers) {
            System.out.println("Question: " + round[QUESTION_INDEX]);

            System.out.print("Your answer: ");

             var userAnswer = scanner.next();
            var correctAnswer = round[ANSWER_INDEX];

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
