package interfaces.ex2;

public class Main {
    public static void main(String[] args) {
        Complexe c1 = new Complexe(4,12);
        Complexe c2 = new Complexe(-3,6);
        Complexe c3,c4;

        // Affichage de Complexe
        System.out.println(c1.affiche());
        System.out.println(c2.affiche());

        c3 = (Complexe) (c1.plus(c2));
        c4 = (Complexe) (c1.moins(c2));
        System.out.println( c3.affiche());
        System.out.println(c4.affiche());

    }
}