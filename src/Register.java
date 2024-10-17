import java.util.Scanner;

public class Register {
    public static void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Username:");
        String username = scanner.nextLine();
        System.out.printf("Email:");
        String email = scanner.nextLine();
        System.out.printf("Password:");
        String password = scanner.nextLine();
    }
}
