import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String clientName, agency;
        float balance = 0.0f;

        System.out.println("Por favor digite seu nome: ");
        clientName = reader.nextLine();

        System.out.println("Digite o nome da agência:");
        agency = reader.nextLine();

        System.out.println("Digitar saldo da conta: ");
        balance = reader.nextFloat();

        System.out.println("Olá " + clientName + " , obrigado por criar uma conta em nosso banco. Sua agência é: " + agency + ". Seu saldo já está disponível.");
        System.out.print("Saldo: " + balance);
    }
}
