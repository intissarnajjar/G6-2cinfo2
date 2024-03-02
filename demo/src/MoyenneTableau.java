public class MoyenneTableau {

    public static double moyenneTableau(int[] tableau) {
        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }
        return (double) somme / tableau.length;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        double moyenne = MoyenneTableau.moyenneTableau(tab);
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }
    //calculer la somme 
}