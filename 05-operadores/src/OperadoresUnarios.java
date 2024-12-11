public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        boolean c = true;

        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios incremento/decremento
        //Pre-incremento
        a = 3;
        resultado = ++a;
        System.out.println("resultado ++a = " + resultado);

        a = 3;
        resultado = a++;
        System.out.println("resultado a++ = " + resultado);
        System.out.println("en este momento se incrementa a = " + a);

        //Pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b = " + resultado);

        b = -2;
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("en este momento se incrementa b = " + b);


    }
}
