package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    public static String game() {
        Random random = new Random();

        StringBuilder progression = new StringBuilder();
        var numbersQuantity = 10;

        var n = 10;
        var progressionStep = random.nextInt(n);
        var positionOfHiddenElem = random.nextInt(n);

        n = 100;
        var progressionElement = random.nextInt(n);

        var hiddenElem = 0;

        for (var i = 0; i < numbersQuantity; i++) {
            if (i == positionOfHiddenElem) {
                progression.append(" ..");

                hiddenElem = progressionElement;
            } else {
                progression.append(" ").append(progressionElement);
            }

            progressionElement = progressionElement + progressionStep;
        }

        System.out.println("Question:" + progression);

        return String.valueOf(hiddenElem);
    }
}
