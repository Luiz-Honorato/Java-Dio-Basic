import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        
        try {
             System.out.println("Digite o primeiro número");
            int n1 = reader.nextInt();

            System.out.println("Digite o segundo número: ");
            int n2 = reader.nextInt();

            if(n1 > n2) {
                throw new ParametrosInvalido();
            }

            for(int i = n1; i <= n2; i++) {
                System.out.println(i);
            }

        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros fornecidos não são números inteiros válidos.");
        } catch (ParametrosInvalido e) {
            System.out.println(e.getMessage());
        }
    }

}