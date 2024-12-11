package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
  public static void main(String[] args) {
    String nombreArchivo = "mi_archivo.txt";
    File archivo = new File(nombreArchivo);
    try{
      if(archivo.exists()){
        System.out.println("El archivo ya existe");
      } else {
        PrintWriter salida = new PrintWriter(new FileWriter((archivo)));
        salida.close();
        System.out.println("Se ha creado el archivo");
      }
    } catch (IOException e){
      System.out.println("Error al crear archivo: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
