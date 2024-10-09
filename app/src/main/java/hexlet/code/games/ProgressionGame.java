package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    public static String game() {
        Random random = new Random();

        StringBuilder progression = new StringBuilder();

        var progressionStep = random.nextInt(10);
        var progressionElement = random.nextInt(100);
        var positionOfHiddenElem = random.nextInt(10);

        var hiddenElem = 0;

        for (var i = 0; i < 10; i++) {
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
