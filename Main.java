import java.util.Scanner;
  public class Main {
  public static void main(String[] args) {
    
    Scanner scanner= new Scanner(System.in);
    System.out.println(" bem vindo ao petshop pelos e patas, qual o nome do seu pet?");
    String nome = scanner.next();
    System.out.println(" qual é o seu pet?");
    String animal= scanner.next();
    System.out.println("qual a raça do/da " + nome + "?");
    String raca = scanner.next();
    System.out.println("qual a idade do " + animal + "?");
    int idade = scanner.nextInt();
    System.out.println("qual o peso do seu " + animal + "?");
    double peso = scanner.nextDouble();

    System.out.println(" cadastro realizado com sucesso!");
  }
  
}
