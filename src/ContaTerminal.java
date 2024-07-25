import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, tudo bem? Para iniciarmos preciso de algumas informações suas.");

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Agora o seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Informe o número de sua agência:");
        String agencia = scanner.next();

        System.out.println("Preciso do número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua " +
                "agência é " + agencia + ", " + "conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}