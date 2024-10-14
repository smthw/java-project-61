package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter." + "\n"
                        + "1 - Greet" + "\n"
                        + "2 - Even" + "\n"
                        + "3 - Calc" + "\n"
                        + "4 - GCD" + "\n"
                        + "5 - Progression" + "\n"
                        + "6 - Prime" + "\n"
                        + "0 - Exit");

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);

        String userAnswer = scanner.next();

        switch (userAnswer) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                EvenGame.game();
                break;
            case "3":
                CalcGame.game();
                break;
            case "4":
                GcdGame.game();
                break;
            case "5":
                ProgressionGame.game();
                break;
            case "6":
                PrimeGame.game();
                break;
            default:
                return;
        }

        scanner.close();
    }
}
