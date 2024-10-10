package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int PROGRESSION_START_RANDOM = 100;
    public static final int PROGRESSION_STEP_RANDOM = 10;
    public static final int POS_OF_HIDDEN_ELEM_RANDOM = 10;

    public static String game() {
        Random random = new Random();

        StringBuilder progression = new StringBuilder();

        var progressionStep = random.nextInt(PROGRESSION_STEP_RANDOM);
        var positionOfHiddenElem = random.nextInt(POS_OF_HIDDEN_ELEM_RANDOM);

        var progressionElement = random.nextInt(PROGRESSION_START_RANDOM);

        var hiddenElem = 0;

        for (var i = 0; i < PROGRESSION_LENGTH; i++) {
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
