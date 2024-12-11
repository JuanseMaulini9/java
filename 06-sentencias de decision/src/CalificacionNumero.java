import java.util.Scanner;

public class CalificacionNumero {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese la calificacion numerica: ");
        double calificacionNumerica = consola.nextInt();
        String calificacionLetra = "";

        if(calificacionNumerica <= 10 && calificacionNumerica >= 9){
            calificacionLetra = "A";
        } else if(calificacionNumerica < 9 && calificacionNumerica >= 8){
            calificacionLetra = "B";
        } else if(calificacionNumerica < 8 && calificacionNumerica >= 7){
            calificacionLetra = "C";
        } else if(calificacionNumerica < 7 && calificacionNumerica >= 6){
            calificacionLetra = "D";
        } else if(calificacionNumerica < 5 && calificacionNumerica >= 4){
            calificacionLetra = "E";
        } else if(calificacionNumerica < 4){
            calificacionLetra = "F";
        }

        System.out.println("calificacion: " + calificacionLetra);
    }
}
