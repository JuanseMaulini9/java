public class GeneradorEmail {
    public static void main(String[] args) {
        String nombre = "Juanse Maulini";
        String empresa = "g mail";
        String dominio = "com";


        String email;
        email = nombre.toLowerCase().replace(" ", ".");
        email = email.concat("@");
        email = email + empresa.toLowerCase().replace(" ", "");
        email = email.concat("." + dominio);

        String email2 = nombre.toLowerCase().replace(" ", ".").concat("@").concat(empresa.toLowerCase().replace(" ", "").concat("." + dominio));

        //String email = String.join("", nombre, empresa);
        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

    }
}
