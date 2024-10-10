package hexlet.code.games;

import java.util.Random;

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

    public static String game() {
        Random random = new Random();

        var firstNum = random.nextInt(MAX_OPERAND_VALUE) + 1;
        var secondNum = random.nextInt(MAX_OPERAND_VALUE) + 1;

        System.out.println("Question: " + firstNum + " " + secondNum);

        return firstNum >= secondNum ? correctAnswer(firstNum, secondNum) : correctAnswer(secondNum, firstNum);
    }
}
