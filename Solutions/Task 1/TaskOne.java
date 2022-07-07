import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int number;
            System.out.println("Please, enter the number:");

            try {
                number = scanner.nextInt();

                if (number > 7) {
                    System.out.println("Привет");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.next();
                continue;
            }

            scanner.nextLine();
            System.out.println("Press Enter to continue or enter NO to exit ");
            String text = scanner.nextLine();

            if (text.equalsIgnoreCase("no")) {
                scanner.close();
                break;
            };
        }
    }
}
