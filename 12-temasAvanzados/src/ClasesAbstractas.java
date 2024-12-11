public class ClasesAbstractas {
  public static void main(String[] args) {
    //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
    FiguraGeometrica figuraGeometricaRectangulo = new Rectangulo();
    figuraGeometricaRectangulo.dibujar();

    FiguraGeometrica figuraGeometricaCirculo = new Circulo();
    figuraGeometricaCirculo.dibujar();
  }
}

abstract class FiguraGeometrica{
  public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica{
  @Override
  public void dibujar(){
    System.out.println("Se dibuja un Rectangulo");
  }
}

class Circulo extends FiguraGeometrica{
  @Override
  public void dibujar() {
    System.out.println("Se dibuja un circulo");
  }
}