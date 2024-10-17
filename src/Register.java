import java.util.Scanner;

public class Register {
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj nazwe:");
        String username = scanner.nextLine();
        System.out.printf("Podaj email:");
        String email = scanner.nextLine();
        System.out.printf("Podaj hasło:");
        String password = scanner.nextLine();
    }
}
