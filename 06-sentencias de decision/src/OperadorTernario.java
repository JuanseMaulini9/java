public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        int numero = 5;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("El numero es: " + resultado);

        // Calcular si es mayor de edad

        int edad = 18;
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (Operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("resultado = " + resultado);
    }
}
