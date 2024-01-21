package abstraites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // Ouvrier
            Date birthday_ovrier = dateFormat.parse("2000-08-09");
            Date date_entree_ouvrier = dateFormat.parse("2022-01-01");
            Employe ouvrier = new Ouvrier(1,"Ouvrier 1","Dbibih",birthday_ovrier,date_entree_ouvrier,2);
            ouvrier.calculerSalaire();
            System.out.println(ouvrier);

            // Cadre
            Date birthday_cadre = dateFormat.parse("2000-08-09");
            Employe cadre = new Cadre(2,"Cadre 1","Dbibih",birthday_cadre,3);
            cadre.calculerSalaire();
            System.out.println(cadre);

            // Patron
            Date birthday_patron = dateFormat.parse("2000-08-09");
            Employe patron = new Patron(2,"Patron 1","Dbibih",birthday_cadre,20000000);
            patron.calculerSalaire(0.3);
            System.out.println(patron);



        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}