import java.util.Scanner;

public class CalculFactorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre pour calculer sa factorielle : ");
        int nombre = scanner.nextInt();

        long resultat = 1;

        for (int i = 1; i <= nombre; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }
}
