public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        System.out.println("titulo: " + tituloLibro);
        System.out.println("año de publicacion: " + anioPublicacion);
        System.out.println("disponible: " + libroDisponible);
        System.out.println("precio: " + precio + "$");

        // Modificar el titulo del libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println("titulo: " + tituloLibro);
    }
}
