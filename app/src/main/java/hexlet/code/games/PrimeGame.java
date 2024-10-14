package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    public static final int MAX_NUMBER = 100;

    static String correctAnswer(int number) {
        for (var i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }

    public static void game() {
        String[][] questionsAnswers = new String[Utils.MAX_ROUNDS_OF_GAME][Utils.QA_FOR_ONE_ROUND];

        var questionNumber = 0;
        var question = "";
        var answer = "";

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            questionNumber = Utils.randomNumber(MAX_NUMBER);
            question = String.valueOf(questionNumber);
            answer = correctAnswer(questionNumber);

            questionsAnswers[i][Utils.QUESTION_INDEX] = "Question: " + question;
            questionsAnswers[i][Utils.ANSWER_INDEX] = answer;
        }

        Engine.playGame(questionsAnswers, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
