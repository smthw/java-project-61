package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    static final int PROGRESSION_LENGTH = 10;
    static final int PROGRESSION_START_RANDOM = 100;
    static final int PROGRESSION_STEP_RANDOM = 10;
    static final int POS_OF_HIDDEN_ELEM_RANDOM = 10;
    static final String GAME_RULE = "What number is missing in the progression?";

    public static void game() {
        String[][] questionsAnswers = new String[Engine.MAX_ROUNDS_OF_GAME][Engine.QA_FOR_ONE_ROUND];

        for (var i = 0; i < Engine.MAX_ROUNDS_OF_GAME; i++) {
            questionsAnswers[i] = generateRoundData();
        }

        Engine.playGame(questionsAnswers, GAME_RULE);
    }
    static String[] generateRoundData() {
        String[] round = new String[Engine.QA_FOR_ONE_ROUND];

        var progressionStep = Utils.randomNumber(PROGRESSION_STEP_RANDOM);
        var hiddenElemIndex = Utils.randomNumber(POS_OF_HIDDEN_ELEM_RANDOM);
        var progressionFirstElement = Utils.randomNumber(PROGRESSION_START_RANDOM);

        var progression = generateProgression(progressionFirstElement, progressionStep, PROGRESSION_LENGTH);
        var answer = progression[hiddenElemIndex];

        progression[hiddenElemIndex] = "..";

        round[Engine.QUESTION_INDEX] = "Question: " + String.join(" ", progression);
        round[Engine.ANSWER_INDEX] = answer;

        return round;
    }

    static String[] generateProgression(int firstElement, int progressionStep, int progressionLength) {
        String[] progression = new String[progressionLength];

        progression[0] = String.valueOf(firstElement);

        var curElement = firstElement;

        for (var i = 1; i < progressionLength; i++) {
            curElement = curElement + progressionStep;

            progression[i] = String.valueOf(curElement);
        }

        return progression;
    }
}
