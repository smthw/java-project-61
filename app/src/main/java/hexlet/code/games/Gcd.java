package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    static final int MAX_OPERAND_VALUE = 20;
    static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    public static void game() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var question = "";
        var answer = "";

        var firstNum = 0;
        var secondNum = 0;

        firstNum = Utils.randomNumber(MAX_OPERAND_VALUE) + 1;
        secondNum = Utils.randomNumber(MAX_OPERAND_VALUE) + 1;

        question = "Question: " + firstNum + " " + secondNum;
        answer = correctAnswer(firstNum, secondNum);

        round[Engine.QUESTION_INDEX] = question;
        round[Engine.ANSWER_INDEX] = answer;

        return round;
    }

    static String correctAnswer(int dividend, int divisor) {
        if (divisor > dividend) {
            var temp = dividend;

            dividend = divisor;
            divisor = temp;
        }

        var gcd = divisor;
        var remainderFromDivision = dividend % divisor;

        while (remainderFromDivision != 0) {
            gcd = divisor;

            remainderFromDivision = dividend % divisor;

            dividend = divisor;
            divisor = remainderFromDivision;
        }

        return String.valueOf(gcd);
    }
}
