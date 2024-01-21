package interfaces.ex3;

public class Main {
    public static void main(String[] args) {
        // Test of Complexe Class
        // Create instance of Complexe object
        Complexe c1 = new Complexe(4,12);
        Complexe c2 = new Complexe(-3,6);
        Complexe c3,c4;

        // Affichage de Complexe
        System.out.println(c1.affiche());
        System.out.println(c2.affiche());

        // Function of plus and moins of Class Complexe
        c3 = (Complexe) (c1.plus(c2));
        c4 = (Complexe) (c1.moins(c2));
        System.out.println( c3.affiche());
        System.out.println(c4.affiche());

        // Test of classe Reel
        // Create instnace of Reel Class
        Reel r1 = new Reel(3);
        //        Object r2 = (Reel) (new Reel(4));
        Reel r2 = new Reel(3);
        Reel r3,r4;
        // Function plus and moins of Class Reel
        r3 = (Reel) r1.plus(r2);
        r4 = (Reel) r2.moins(r1);
        System.out.println( r3.affiche());
        System.out.println(r4.affiche());

    }
}