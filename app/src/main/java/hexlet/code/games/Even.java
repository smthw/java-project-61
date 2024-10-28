package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int MAX_NUMBER = 100;
    static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var questionNumber = Utils.randomNumber(MAX_NUMBER);
        var question = String.valueOf(questionNumber);
        var answer = correctAnswer(questionNumber);

        round[Engine.QUESTION_INDEX] = "Question: " + question;
        round[Engine.ANSWER_INDEX] = answer;

        return round;
    }

    static String correctAnswer(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}