package hexlet.code;

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

        Engine.run(userAnswer);

        scanner.close();
    }
}
