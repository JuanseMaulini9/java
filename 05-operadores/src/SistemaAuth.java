import java.util.Scanner;

public class SistemaAuth {
    public static void main(String[] args) {
        final String USER_NAME = "Juanse";
        final String USER_PASSWORD = "123456";

        Scanner console = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String username = console.nextLine();

        System.out.println("Ingrese la contraseña del usuario: ");
        String password = console.nextLine();

        boolean result = username.equals(USER_NAME) && password.equals(USER_PASSWORD);
        System.out.println("Es valido? " + result);
    }
}
