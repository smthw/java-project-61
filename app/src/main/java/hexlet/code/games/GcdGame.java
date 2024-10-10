package hexlet.code.games;

import java.util.Random;

public class GcdGame {
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

        var n = 20;

        var firstNum = random.nextInt(n) + 1;
        var secondNum = random.nextInt(n) + 1;

        System.out.println("Question: " + firstNum + " " + secondNum);

        return firstNum >= secondNum ? correctAnswer(firstNum, secondNum) : correctAnswer(secondNum, firstNum);
    }
}
