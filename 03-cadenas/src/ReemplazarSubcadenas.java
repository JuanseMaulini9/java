public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);
        
        //Reemplazar "Mundo" por "a todos"
        
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
