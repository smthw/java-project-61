package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame {
    public static final int MAX_OPERAND_VALUE = 20;

    static String correctAnswer(int dividend, int divisor) {
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

    public static void game() {
        String[][] questionsAnswers = new String[Utils.MAX_ROUNDS_OF_GAME][Utils.QA_FOR_ONE_ROUND];

        var question = "";
        var answer = "";

        var firstNum = 0;
        var secondNum = 0;

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            firstNum = Utils.randomNumber(MAX_OPERAND_VALUE) + 1;
            secondNum = Utils.randomNumber(MAX_OPERAND_VALUE) + 1;

            question = "Question: " + firstNum + " " + secondNum;
            answer = firstNum >= secondNum ? correctAnswer(firstNum, secondNum) : correctAnswer(secondNum, firstNum);

            questionsAnswers[i][Utils.QUESTION_INDEX] = question;
            questionsAnswers[i][Utils.ANSWER_INDEX] = answer;
        }

        Engine.playGame(questionsAnswers, "Find the greatest common divisor of given numbers.");
    }
}
