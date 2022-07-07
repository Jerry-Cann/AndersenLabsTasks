import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the array:");

        String preprocess = scanner.nextLine();

        args = preprocess.split("\\s+");

        if (args.length > 0) {

            try {

                for (String arg: args) {

                    Integer num = Integer.parseInt(arg);

                    if(num%3 == 0) System.out.println(num);

                }

            } catch (NumberFormatException e) {

                System.err.println("Arguments must be integers!");

                System.exit(1);

            }


        }
        scanner.close();
    }
}
