package hexlet.code.games;

import java.util.Random;

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

    public static String game() {
        Random random = new Random();

        String[] operations = {"+", "-", "*"};

        var firstOperand = random.nextInt(MAX_OPERAND_VALUE);
        var secondOperand = random.nextInt(MAX_OPERAND_VALUE);

        var index = random.nextInt(operations.length);

        System.out.println("Question: " + firstOperand + " " + operations[index] + " " + secondOperand);

        return correctAnswer(firstOperand, secondOperand, operations[index]);
    }
}
