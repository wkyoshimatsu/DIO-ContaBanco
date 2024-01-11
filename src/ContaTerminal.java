import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner entradaTerminal = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = entradaTerminal.nextInt();
        
        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = entradaTerminal.next();
        
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = entradaTerminal.next();
        
        System.out.println("Por favor, digite o seu sobrenome!");
        String sobrenomeCliente = entradaTerminal.next();

        String nomeCompletoCliente  = nomeCliente.concat(" ").concat(sobrenomeCliente);

        System.out.println("Por favor, digite o saldo!");
        double saldo = entradaTerminal.nextDouble();

        //String resposta = "Olá " + nomeCompletoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.";

        //System.out.println(resposta);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque./n", nomeCompletoCliente, numeroAgencia, numeroConta, saldo);
    }
}
