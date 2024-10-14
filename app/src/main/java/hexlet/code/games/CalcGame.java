package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    public static final int MAX_OPERAND_VALUE = 10;

    static String correctAnswer(int firstOperand, int secondOperand, String operation) {
        var expressionResult = 0;

        switch (operation) {
            case "+":
                expressionResult = firstOperand + secondOperand;
                break;
            case "-":
                expressionResult = firstOperand - secondOperand;
                break;
            default:
                expressionResult = firstOperand * secondOperand;
        }

        return String.valueOf(expressionResult);
    }

    public static void game() {
        String[][] questionsAnswers = new String[Utils.MAX_ROUNDS_OF_GAME][Utils.QA_FOR_ONE_ROUND];

        var question = "";
        var answer = "";

        String[] operations = {"+", "-", "*"};

        var firstOperand = 0;
        var secondOperand = 0;
        var index = 0;

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            firstOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
            secondOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
            index = Utils.randomNumber(operations.length);

            question = "Question: " + firstOperand + " " + operations[index] + " " + secondOperand;

            answer = correctAnswer(firstOperand, secondOperand, operations[index]);

            questionsAnswers[i][Utils.QUESTION_INDEX] = question;
            questionsAnswers[i][Utils.ANSWER_INDEX] = answer;
        }

        Engine.playGame(questionsAnswers, "What is the result of the expression?");
    }
}
