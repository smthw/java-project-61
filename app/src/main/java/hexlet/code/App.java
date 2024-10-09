package hexlet.code;

import java.util.Scanner;

public class App {
    public static String[] games = {"1", "2", "3", "4"};

    public static void main(String[] args) {
        System.out.println(
                "Please enter the game number and press Enter." + "\n"
                        + "1 - Greet" + "\n"
                        + "2 - Even" + "\n"
                        + "3 - Calc" + "\n"
                        + "4 - GCD" + "\n"
                        + "0 - Exit");

        System.out.print("Your choice: ");

        Scanner scanner = new Scanner(System.in);

        String userAnswer = scanner.next();

        Engine.main(userAnswer);

//         switch (userAnswer) {
//            case "1":
//                Cli.greeting();
//                break;
//            case "2":
//                EvenGame.game();
//                break;
//             case "3":
//                 CalcGame.game();
//                 break;
//            default:
//                scanner.close();
//
//                return;
//        }
//        if (userAnswer.equals("1")) {
//            System.out.println("Welcome to the Brain Games!");
//
//            Cli.greeting();
//        }
        scanner.close();

//        return;
    }
}
