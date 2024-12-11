public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas en nombres de variables
        String nombreCompleto = "Juanse Maulini"; // Correcto, Buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juanse Maulini 2"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Juanse"; // Incorrecto, no respeta las reglas
        String nombre_cliente = "Juanse"; //Correcto, pero anda a python
        String _apellido = "Maulini"; //Correcto y aceptable
        String $apellido = "Maulini"; // Correcto y aceptable
        int totPzs = 10; // Correcto pero no aplica buenas practicas
        int totalPiezas = 10; // Correcto y aplica buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto y aplica buenas practicas
        boolean isCasado = true; // Correcto y aplica buenas practicas
        boolean tieneSaldo = true; // Correcto y aplica buenas practicas
        boolean hasSaldo = true; // Correcto y aplica buenas practicas
    }
}
