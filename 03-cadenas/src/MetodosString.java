public class MetodosString {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola Mundo";
        
        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'u');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minisculas
        System.out.println("minisculas = " + cadena1.toLowerCase());

        // Eliminar espacios al iniico y al final de una cadena
        var cadena2 = " Juanse Maulini ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
