public class ReservaHoteles {
    public static void main(String[] args) {
        String nombreCliente = "Juanse Maulini";
        int diasEstancia = 3;
        double tarifaDiaria = 10.5;
        boolean vistaAlMar = true;

        System.out.println("NombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);

        nombreCliente = "Monkey D. Luffy";
        diasEstancia = 1;
        tarifaDiaria = 12.99;
        vistaAlMar = false;

        System.out.println();
        System.out.println("NombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaAlMar = " + vistaAlMar);
    }
}
