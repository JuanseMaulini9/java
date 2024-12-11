public class IndicesCadena {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        
        // Recuperar el primer caracter
        char primerCaracter = cadena1.charAt(0); // Recuperar el caracter de H

        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Imprimir letra M, indice 5
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
