import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please, enter the name or type STOP to exit:");
            String name = scanner.nextLine();

            if(name.equalsIgnoreCase("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
                continue;

            } else if(name.equalsIgnoreCase("stop")) {
                scanner.close();
                break;
            };

            System.out.println("Нет такого имени.");

        }
    }
}
