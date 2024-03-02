public class SommeTableau {

    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }
        return somme;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int somme = SommeTableau.sommeTableau(tab);
        System.out.println("La somme des éléments du tableau est : " + somme);
    }

    //Cette classe contient deux méthodes: sommeTableau et main.

       
}



