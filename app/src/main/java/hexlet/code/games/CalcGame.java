package hexlet.code.games;

import java.util.Random;

public class CalcGame {
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

        var firstOperand = random.nextInt(10);
        var secondOperand = random.nextInt(10);
        var index = random.nextInt(3);

        System.out.println("Question: " + firstOperand + " " + operations[index] + " " + secondOperand);

        return correctAnswer(firstOperand, secondOperand, operations[index]);
    }
}
