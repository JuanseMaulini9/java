package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
  public static void main(String[] args) {
    boolean anexar = false;
    String nombreArchivo = "mi_archivo.txt";
    File archivo = new File(nombreArchivo);
    try{
      anexar = archivo.exists();
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
      String nuevoContenido = "Nuevo\ncontenido";
      salida.println(nuevoContenido);
      salida.close();
      System.out.println("Se agrego contenido al archivo");
    }catch (Exception e){

      System.out.println("Error a escribir al archivo: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
