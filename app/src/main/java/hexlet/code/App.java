package hexlet.code;

import hexlet.code.games.Even;
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
            default:
                return;
        }

        scanner.close();
    }
}
