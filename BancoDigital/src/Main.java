public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        // Criando contas para os clientes
        Conta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.setNumero(123);

        Conta contaPoupanca = new ContaPoupanca(cliente2);
        contaPoupanca.setNumero(456);

        // Operações nas contas
        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.transferir(300, contaPoupanca);

        contaPoupanca.depositar(500);

        // Imprimir extratos
        contaCorrente.imprimirExtrato();
        System.out.println("------------------");
        contaPoupanca.imprimirExtrato();
    }
}
