// Classes, Objetos, Métodos Construtores
class Carro {
  String modelo;

  public Carro(String modelo) {
    this.modelo = modelo;

    System.out.println(this.modelo);
  }

  public void acelerar() {
    System.out.println("Acelerando o carro " + this.modelo);
  }
}