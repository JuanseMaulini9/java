package persona;

public class Persona {

  private static int contadorPersonas = 0;
  private int idPersona;
  private String nombre;
  private String apellido;

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    //Asignar un id unico con ayuda de la variable estatuca
    this.idPersona = ++Persona.contadorPersonas;
  }

  @Override
  public String toString() {
    return "id: " + idPersona
            + ", Nombre: " + this.nombre
            + ", Apellido: " + this.apellido;
  }

  public String getNombre() {
    return this.nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getIdPersona() {
    return this.idPersona;
  }

  public static int getContadorPersonas() {
    return Persona.contadorPersonas;
  }

}