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
        System.out.println("Find the greatest common divisor of given numbers.");

        Random random = new Random();

        var firstNum = 0;
        var secondNum = 0;

        firstNum = random.nextInt(20) + 1;
        secondNum = random.nextInt(20) + 1;

        System.out.println("Question: " + firstNum + " " + secondNum);

        return firstNum >= secondNum ? correctAnswer(firstNum, secondNum) : correctAnswer(secondNum, firstNum);
    }
}
