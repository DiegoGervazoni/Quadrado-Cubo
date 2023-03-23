import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Valores: ");
        int valores = sc.nextInt();

        for(int i = 1; i <= valores; i++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println("Numero: " + i + ", i²= " + quadrado + ", i³= " + cubo);
        }

        System.out.println("\nFim!");

        sc.close();
    }
}
