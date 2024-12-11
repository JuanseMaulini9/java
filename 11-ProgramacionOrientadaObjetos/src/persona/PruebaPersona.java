package persona;

public class PruebaPersona {
  public static void main(String[] args) {
    System.out.println("Variable estatica: " + Persona.getContadorPersonas());

    // Primer objeto
    Persona persona1 = new Persona("Juanse", "Maulini");
    System.out.println(persona1);
    System.out.println("Variable estatica: " + Persona.getContadorPersonas());

    // Segundo objeto
    Persona persona2 = new Persona("Zoro", "Roronoa");
    System.out.println(persona2);
    System.out.println("Variable estatica: " + Persona.getContadorPersonas());

  }
}
