import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        final int TARIFA_NACIONAL = 10;
        final int TARIFA_INTERNACIONAL = 20;

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el destino (nacional/internacional): ");
        String destino = consola.nextLine();

        System.out.println("Ingrese el peso del paquete: ");
        double peso = consola.nextDouble();
        double precio = 0;
        if(destino.toLowerCase().equals("nacional")){
            precio = TARIFA_NACIONAL * peso;
        } else if (destino.toLowerCase().equals("internacional")) {
            precio = TARIFA_INTERNACIONAL * peso;
        } else{
            System.out.println("destino invalido");
        }
        System.out.println("el costo de envio es de: " + precio);



    }
}
