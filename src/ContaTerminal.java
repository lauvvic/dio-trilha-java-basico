import java.util.Scanner;

public class ContaTerminal {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) throws Exception {
    
    Scanner scanner = new Scanner(System.in);

      System.out.println("Seja Bem-Vindo! Por favor, digite o seu nome: ");
        String nome = scanner.next();
      // Tive dificuldade no terminal em relação ao nome composto, onde só consegui que finalizasse a depuração com nome simples.

      System.out.println("Digite o número da sua conta em até quatro dígitos: ");
        int conta = scanner.nextInt();

      System.out.println("Digite o número da sua agência em até quatro dígitos: ");
        int agencia = scanner.nextInt();

      System.out.println("Digite o valor que deseja sacar: ");
        double valor = scanner.nextDouble();
        
        System.out.println("Olá, "+ nome + "! Obrigada por criar uma conta em nosso banco. Sua conta é "+ conta + ", sua agencia "+ agencia + " e seu valor R$"+ valor + " já está disponível para saque.");
 }

}
