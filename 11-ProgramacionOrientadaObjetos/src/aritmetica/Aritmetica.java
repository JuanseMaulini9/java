package aritmetica;

public class Aritmetica {

  private int operando1;
  private int operando2;

  //Constructor vacio
  public Aritmetica(){

  }

  public Aritmetica(int operando1, int operando2){
    System.out.println("Ejecutando constructor");
    this.operando1 = operando1;
    this.operando2 = operando2;
  }

  public void sumar() {
    int resultado = this.operando1 + this.operando2;
    System.out.println("resultado suma: " + resultado);
  }

  public void restar() {
    int resultado = this.operando1 - this.operando2;
    System.out.println("resultado resta: " + resultado);
  }

  public int getOperando1() {
    return this.operando1;
  }

  public void setOperando1(int operando1) {
    this.operando1 = operando1;
  }

  public int getOperando2(){
    return this.operando2;
  }

  public void setOperando2(int operando2){
    this.operando2 = operando2;
  }


}
