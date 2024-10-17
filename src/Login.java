import java.util.Scanner;


public class Login {
    private static String password = "Admin";
    private static String username = "admin";

    static public void login() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type username: ");
        String userName = myObj.nextLine();
        System.out.println("Type password: ");
        String Password = myObj.nextLine();

        if(userName == username && Password == password) {
            System.out.println("Logged");
        }else{
            System.out.println("False email or username");
        }



    }

}
