package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int MAX_OPERAND_VALUE = 10;
    static final String GAME_RULE = "What is the result of the expression?";

    public static void game() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        String[] operations = {"+", "-", "*"};

        var firstOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
        var secondOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
        var index = Utils.randomNumber(operations.length);

        var question = "Question: " + firstOperand + " " + operations[index] + " " + secondOperand;
        var answer = correctAnswer(firstOperand, secondOperand, operations[index]);

        round[Engine.QUESTION_INDEX] = question;
        round[Engine.ANSWER_INDEX] = answer;

        return round;
    }

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
}
