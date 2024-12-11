public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java***");
        
        //Sin uso de var
        String nombre = "Juanse";
        System.out.println("nombre = " + nombre);
        //Con uso de var
        var nombre2 = "Luffy";
        System.out.println("nombre2 = " + nombre2);
        //Definir otras variables
        var edad = 24; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Se infiere el tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true;
        System.out.println("esCasado = " + esCasado);

        // Se debe definir tambien su valor
        //var precio; esto lanza un error, hay que darle un valor desde la decalaracion de la variable
        //precio = 10;

        // se debe inferir el tipo de dato
        //var apellido = null; no se puede inferir el tipo de dato
    }
}
