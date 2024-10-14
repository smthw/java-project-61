package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static final int MAX_NUMBER = 100;

    public static void game() {
        String[][] questionsAnswers = new String[Utils.MAX_ROUNDS_OF_GAME][Utils.QA_FOR_ONE_ROUND];

        var questionNumber = 0;
        var question = "";
        var answer = "";

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            questionNumber = Utils.randomNumber(MAX_NUMBER);
            question = String.valueOf(questionNumber);
            answer = questionNumber % 2 == 0 ? "yes" : "no";

            questionsAnswers[i][Utils.QUESTION_INDEX] = "Question: " + question;
            questionsAnswers[i][Utils.ANSWER_INDEX] = answer;
        }

        Engine.playGame(questionsAnswers, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
