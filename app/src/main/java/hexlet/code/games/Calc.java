package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int MAX_OPERAND_VALUE = 10;
    static final String GAME_RULE = "What is the result of the expression?";
    static final String[] OPERATIONS = {"+", "-", "*"};

    public static void game() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }

    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var firstOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
        var secondOperand = Utils.randomNumber(MAX_OPERAND_VALUE);
        var index = Utils.randomNumber(OPERATIONS.length);

        var question = firstOperand + " " + OPERATIONS[index] + " " + secondOperand;
        var answer = Calculate(firstOperand, secondOperand, OPERATIONS[index]);

        round[Engine.QUESTION_INDEX] = question;
        round[Engine.ANSWER_INDEX] = String.valueOf(answer);

        return round;
    }

    static int Calculate(int firstOperand, int secondOperand, String operation) {
        return switch (operation) {
            case "+" -> firstOperand + secondOperand;
            case "-" -> firstOperand - secondOperand;
            case "*" -> firstOperand * secondOperand;
            default -> throw new RuntimeException("Unknown operation: " + operation);
        };
    }
}
