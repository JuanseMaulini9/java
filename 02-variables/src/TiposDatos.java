public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos en java
        //Enteros (valor por default 0)
        
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar que es de tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante (valor por default 0.0)
        float tipoFloat = 3.14F; // f o F para indicar que es un tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D;
        
        //Caracter (valor default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        //Booleano (valor default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        // Tipos Object o referencia 
        String nombre = null; // Valor por defautl
        System.out.println("nombre = " + nombre);
        nombre = "Juanse";
        System.out.println("nombre = " + nombre);
        
    }
}
