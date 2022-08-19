import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite N: ");
        int n = sc.nextInt();
        System.out.println("Digite uma palavra: ");
        String frase = sc.next();

        System.out.println(somatorio(n));
        System.out.println(reverte(frase));
        sc.close();
    }

    // Exercício 1
    public static int somatorio(int n) {
        if (n<=0) {
            return 0;
        } else {
            return n+(somatorio(n-1));
        }
    }

    // Exercício 2
    private static String inversa = "";
    public static String reverte(String original) {
        if (original.length() == 0) {
            return inversa;
        } else {
            inversa += original.charAt(original.length() - 1);
            String original2 = original.substring(0, original.length()-1);
            reverte(original2);
            return inversa;
        }
    }

    // Exercício 3
    // Está no arquivo "Result.java"
}
