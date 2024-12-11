package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
  public static void main(String[] args) {
    System.out.println("*** Ejemplo aritmetica.Aritmetica ***");

    Aritmetica objeto1 = new Aritmetica(5, 7);

    System.out.println("Operando 1: " + objeto1.getOperando1());
    objeto1.setOperando1(2);
    objeto1.setOperando2(13);

    objeto1.sumar();
    objeto1.restar();

    var aritmetica2 = new Aritmetica(12,3);
    aritmetica2.sumar();

  }
}
