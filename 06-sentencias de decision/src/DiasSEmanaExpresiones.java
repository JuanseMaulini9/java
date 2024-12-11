public class DiasSEmanaExpresiones {
    public static void main(String[] args) {
        int dia = 3;
        String nombreDia;

        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Juves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domigo";
            default -> "Dia invalido";
        };
        System.out.println(nombreDia);
    }
}
