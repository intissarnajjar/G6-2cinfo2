public class NombrePremier {
    
    // Méthode pour vérifier si un nombre est premier
    static boolean estPremier(int nombre) {
        // Si le nombre est inférieur ou égal à 1, il n'est pas premier
        if (nombre <= 1) {
            return false;
        }
        // new message nombrepremier
        // Vérification si le nombre est divisible par un nombre autre que 1 et lui-même
        for (int i = 2; i < nombre; i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        
        // Si aucune condition précédente n'est satisfaite, le nombre est premier
        return true;
    }
    
    public static void main(String[] args) {
        int nombre = 17; // Mettez ici le nombre que vous voulez vérifier
        
        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        } else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }
}
