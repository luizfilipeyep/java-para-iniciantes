import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    int idade = 10;
    String nome = "Luiz";

    var nomeVariavel = "Filipe";

    /*

    > Números inteiros

    byte -> 8 bits | -128 a 127
    short -> 16 bits | -32.768 a 32;767
    int -> 32 bits | -2.147.483.648 a 2.147.483.647
    long -> 64 bits | -9.223.372.036.854.775.808 e 9.223.372.036.854.775.807

    > Números décimais

    float -> 32 bits | precisão simples
    double -> 64 bits | precisão dupla

    > Palavras, cadeia e caracteres

    String -> representar palavras e frases ""
    char -> representar um único caractere ''

    > Lógico
    boolean -> true ou false

    */

    byte b = 100;
    short s = 10000;
    int i = 100000;
    long l = 100000L;
    float f = 10.5f;
    double d = 20.5;
    char c = 'A';
    boolean bool = true;
    String str = "Luiz";

    // Condicionais
    if (b > 99) {
      System.out.println("Verdadeiro");
    } else {
      System.out.println("Falso");
    }

    // Vetores
    int[] colecaoDeInteiros = { 1, 2, 3, 4, 5 };
    System.out.println(colecaoDeInteiros[4]);
    /*
     length -> tamnho do array
     */
    int[] meusNumeros = new int[4];

    // ArrayList
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Luiz");
    nomes.add("Ricardo");
    nomes.add("Mariana");

    System.out.println(nomes.get(1));

    nomes.remove(2);
    nomes.remove("Ricardo");

    // Loops (for e while)
    for (i = 0; i < nomes.size(); i++) {
      System.out.println(nomes.get(i));
    }

    int contador = 0;
    while (contador < 10) {
      System.out.println("Estou no While");
      contador++;
    }

    // Castings (mudança de tipos)
    double resultado = 0.0;
    int resultadoInt = (int)resultado;

    int meuInt = 10;
    double meuDouble = (double)meuInt;

    String meuString = "10";
    int meuInt2 = Integer.parseInt(meuString);

    String meuString2 = String.valueOf(meuInt2);
  }
}