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
        var positionOfHiddenElem = Utils.randomNumber(POS_OF_HIDDEN_ELEM_RANDOM);
        var progressionFirstElement = Utils.randomNumber(PROGRESSION_START_RANDOM);

        var question = generateProgression(progressionStep, positionOfHiddenElem, progressionFirstElement);
        var answer = correctAnswer(progressionStep, positionOfHiddenElem, progressionFirstElement);

        round[Engine.QUESTION_INDEX] = "Question:" + question;
        round[Engine.ANSWER_INDEX] = answer;

        return round;
    }

    static StringBuilder generateProgression(int progressionStep, int positionOfHiddenElem, int progressionElement) {
        StringBuilder progression = new StringBuilder();

        for (var j = 0; j < PROGRESSION_LENGTH; j++) {
            if (j == positionOfHiddenElem) {
                progression.append(" ..");
            } else {
                progression.append(" ").append(progressionElement);
            }

            progressionElement = progressionElement + progressionStep;
        }

        return progression;
    }

    static String correctAnswer(int progressionStep, int positionOfHiddenElem, int progressionFirstElement) {
        if (positionOfHiddenElem == 0) {
            return String.valueOf(progressionFirstElement);
        }

        var hiddenElem = progressionFirstElement + progressionStep * positionOfHiddenElem;

        return  String.valueOf(hiddenElem);
    }
}
