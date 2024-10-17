import java.util.Scanner;


public class Login {
    private static String password = "Admin";
    private static String username = "admin";

    static public void login() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Podaj username: ");
        String userName = myObj.nextLine();
        System.out.println("Podaj password: ");
        String password = myObj.nextLine();

        if(userName == username && password == password) {
            System.out.println("Zalogowano");
        }else{
            System.out.println("Błędne");
        }



    }

}
