package java_curso;

// Classes, Objetos, Métodos Construtores
public class Carro {
  String modelo;

  public static void main(String[] args) {
    System.out.println("Teste");
  }

  public Carro(String modelo) {
    this.modelo = modelo;

    System.out.println(this.modelo);
  }

  public void acelerar() {
    System.out.println("Acelerando o carro " + this.modelo);
  }
}