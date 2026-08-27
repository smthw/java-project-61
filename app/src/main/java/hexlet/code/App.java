package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                "Please enter the run number and press Enter."
                        + "\n"
                        + "1 - Greet"
                        + "\n"
                        + "2 - Even"
                        + "\n"
                        + "3 - Calc"
                        + "\n"
                        + "4 - GCD"
                        + "\n"
                        + "5 - Progression"
                        + "\n"
                        + "0 - Exit");

        Scanner scanner = new Scanner(System.in);

        String userAnswer = scanner.next();

        System.out.println("Your choice: " + userAnswer);

        switch (userAnswer) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.run();
                break;
            case "3":
                Calc.run();
                break;
            case "4":
                Gcd.run();
                break;
            case "5":
                Progression.run();
                break;
            default:
                return;
        }

        scanner.close();
    }
}
