import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        long numero = scanner.nextLong();

        System.out.println("Digite seu Saldo: ");
        float saldo = scanner.nextFloat();


       String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
       
       System.out.println(mensagem);


        scanner.close();






    }
}

