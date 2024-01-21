package interfaces.ex1;

import abstraites.*;
import interfaces.ex1.Personne;
import interfaces.ex1.Profile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date_p1 =  dateFormat.parse("2001-08-30");
        Date date_p2 =  dateFormat.parse("2001-08-14");


        Profile directeur = new Profile(1,"DKLG589","directeur");
        Profile employee = new Profile(2,"FKL896","employee");

        Personne p1 = new Personne(1,"Marouane","Dbibih",date_p1,20000.00,directeur);
        Personne p2 = new Personne(1,"Achraf","Attwaki",date_p2,9000.00,employee);

        p1.afficher();
        p2.afficher();

    }
}