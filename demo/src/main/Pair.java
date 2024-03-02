import java.util.Scanner;

public class VerifierNombrePair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un chifre : ");
        String nombre = scanner.nextline();

        System.out.println(nombre % "2" == 0 ? "Nombre pair." : "Nombre impair.");
    }
}
