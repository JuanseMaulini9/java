package animales;

public class Animal {

  protected void hacerSonido(){
    System.out.println("El animal hace un sonido");
  }

}

class Perro extends Animal {

  @Override
  protected void hacerSonido(){
    System.out.println("Guau");
  }
}

class Gato extends Animal {

  @Override
  protected void hacerSonido(){
    System.out.println("Miau");
  }
}

class PruebaAnimal {

  // Metodo polimorfico
  static void imprimirSonido(Animal animal){
    animal.hacerSonido();
  }

  public static void main(String[] args) {
    System.out.println("*** Ejemplo de herencia ***");

    Animal animal = new Animal();
    Perro perro = new Perro();
    Gato gato = new Gato();

    imprimirSonido(animal);
    imprimirSonido(perro);
    imprimirSonido(gato);

  }
}