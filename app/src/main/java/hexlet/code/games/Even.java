package hexlet.code.games;

import hexlet.code.Cli;
import java.util.Random;
import java.util.Scanner;

public class Even {
    static final int MAX_NUMBER = 100;
    static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int MAX_ROUNDS_OF_GAME = 3;
    static final int QA_FOR_ONE_ROUND = 2;
    static final int QUESTION_INDEX = 0;
    static final int ANSWER_INDEX = 1;
    static final Random RANDOM = new Random();

    public static void run() {
        String[][] questionsAnswers = new String[MAX_ROUNDS_OF_GAME][];

        for (var i = 0; i < MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[QA_FOR_ONE_ROUND];

        var questionNumber = RANDOM.nextInt(1, MAX_NUMBER);
        var question = String.valueOf(questionNumber);
        var answer = isEven(questionNumber) ? "yes" : "no";

        round[QUESTION_INDEX] = question;
        round[ANSWER_INDEX] = answer;

        return round;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

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
                System.out.println(
                        "'"
                                + userAnswer
                                + "' is wrong answer ;(."
                                + "Correct answer was '"
                                + correctAnswer
                                + "'.");

                System.out.println("Let's try again, " + userName + "!");

                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
