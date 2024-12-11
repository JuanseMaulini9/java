import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        final String USER_NAME = "Juanse";
        final String USER_PASSWORD = "1234";

        System.out.print("Ingrese su nombre de usuario: ");
        String username = consola.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String password = consola.nextLine();

        if(username.equals(USER_NAME)  && password.equals(USER_PASSWORD)){
            System.out.println("Bienvenido al sistema");
        } else if(!username.equals(USER_NAME)  && password.equals(USER_PASSWORD)){
            System.out.println("Usuario invalido");
        } else if(username.equals(USER_NAME)){
            System.out.println("Contraseña invalido");
        } else{
            System.out.println("Usuario y contraseña invalidos");
        }

    }
}
