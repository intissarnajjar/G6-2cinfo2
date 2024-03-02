public class CalculPuissance {
    
    // Méthode pour calculer la puissance d'un nombre
    static double puissance(double nombre, int exposant) {
        return Math.pow(nombre, exposant);
    } // new message puissancegit
    
    public static void main(String[] args) {
        double nombre = 2; // Mettez ici le nombre
        int exposant = 3; // Mettez ici l'exposant
        
        double resultat = puissance(nombre, exposant);
        System.out.println(nombre + " à la puissance " + exposant + " = " + resultat);
    }
}