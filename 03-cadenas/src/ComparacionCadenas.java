public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //comparacion de cadenas (==) compara la referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        //Compara contenido
        System.out.print("cadena1 es igual en equals a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
