import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número da conta (inteiro)
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir o ENTER que ficou no buffer

        // Solicitar agência (texto)
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicitar nome do cliente (texto)
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicitar saldo (decimal)
        System.out.println("Por favor, digite o saldo inicial!");
        double saldo = scanner.nextDouble();

        // Construir mensagem usando concatenação
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Mostrar mensagem
        System.out.println(mensagem);

        scanner.close();
    }
}
