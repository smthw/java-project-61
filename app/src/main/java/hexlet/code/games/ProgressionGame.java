package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int PROGRESSION_START_RANDOM = 100;
    public static final int PROGRESSION_STEP_RANDOM = 10;
    public static final int POS_OF_HIDDEN_ELEM_RANDOM = 10;

    public static void game() {
        String[][] questionsAnswers = new String[Utils.MAX_ROUNDS_OF_GAME][Utils.QA_FOR_ONE_ROUND];

        StringBuilder progression = new StringBuilder();

        var progressionStep = 0;
        var positionOfHiddenElem = 0;
        var progressionElement = 0;

        var hiddenElem = 0;

        for (var i = 0; i < Utils.MAX_ROUNDS_OF_GAME; i++) {
            progression.setLength(0);

            progressionStep = Utils.randomNumber(PROGRESSION_STEP_RANDOM);
            positionOfHiddenElem = Utils.randomNumber(POS_OF_HIDDEN_ELEM_RANDOM);
            progressionElement = Utils.randomNumber(PROGRESSION_START_RANDOM);

            for (var j = 0; j < PROGRESSION_LENGTH; j++) {
                if (j == positionOfHiddenElem) {
                    progression.append(" ..");

                    hiddenElem = progressionElement;
                } else {
                    progression.append(" ").append(progressionElement);
                }

                progressionElement = progressionElement + progressionStep;
            }

            questionsAnswers[i][Utils.QUESTION_INDEX] = "Question: " + progression;
            questionsAnswers[i][Utils.ANSWER_INDEX] = String.valueOf(hiddenElem);
        }

        Engine.playGame(questionsAnswers, "What number is missing in the progression?");
    }
}
