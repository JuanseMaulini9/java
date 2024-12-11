public class FormateoCadenas {
    public static void main(String[] args) {
        var nombre = "Juanse";
        var edad = 24;
        var salario = 21.50;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;

        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNumero empleado: %04d
                \tEdad: %d años
                \tsalario: $%.2f
                
                """.formatted(nombre, numeroEmpleado, edad, salario);

        System.out.println(mensaje);
        //Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNumero empleado: %04d
                \tEdad: %d años
                \tsalario: $%.2f
                
                """, nombre, numeroEmpleado, edad, salario);
    }
}
