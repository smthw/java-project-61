package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    static final int MAX_OPERAND_VALUE = 20;
    static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    public static void run() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var firstNum = Utils.randomNumber(MAX_OPERAND_VALUE);
        var secondNum = Utils.randomNumber(MAX_OPERAND_VALUE);

        var question = "Question: " + firstNum + " " + secondNum;
        var answer = findGcd(firstNum, secondNum);

        round[Engine.QUESTION_INDEX] = question;
        round[Engine.ANSWER_INDEX] = String.valueOf(answer);

        return round;
    }

    static int findGcd(int dividend, int divisor) {
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

        return gcd;
    }
}
