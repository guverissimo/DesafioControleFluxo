import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o primeiro numero:");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero:");
            int num2 = scanner.nextInt();

            contar(num1, num2);   

            scanner.close();
        } catch (ParametrosInvalidosException e) {
            System.out.println("O primeiro numero nao pode ser maior que o primeiro");
        }
    }

    static void contar(int n1, int n2) throws ParametrosInvalidosException{
        if(n1 >n2)
        throw new ParametrosInvalidosException();

        int contagem = n2 - n1;
        System.out.println("O resultado da subtração foi de: " + contagem);
        System.out.println("Contando até " + contagem);
        for (int i = 1; i<=contagem; i ++){
            System.out.println("Imprimindo o numero: " + i);
        }
    }
}
