import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String agencia;
        String Nome_Cliente;
        double Saldo;

        System.out.println("bem vindo(a)");
        System.out.println("Entre com o numero da conta");
        Numero = scanner.nextInt();
        System.out.println("seu numero é: " + Numero);
        System.out.println("entre com sua agencia"); 
        agencia = scanner.next();
        System.out.println("sua agencia: " + agencia);
        System.out.println("entre com seu nome");
        Nome_Cliente = scanner.next();
        System.out.println("seu nome: " + Nome_Cliente);
        System.out.println("entre com um saldo");
        Saldo = scanner.nextDouble();
        System.out.println("seu saldo: " + Saldo);
        System.out.println("Conta criada!");

    }
}
