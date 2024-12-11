public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and");
        
        boolean a = true, b = false;
        boolean resultado = a && b;
        System.out.println("resultado  (a = true, b = false) = " + resultado);
        
        b = true;
        resultado = a && b;
        System.out.println("resultado (a = true, b = true) = " + resultado);
    }   
}
