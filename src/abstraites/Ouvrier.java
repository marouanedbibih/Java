package abstraites;

import java.util.Date;

public class Ouvrier extends Employe{
    private Date date_entree;
    private static double SMIG = 2500.00;
    private int anciennete_annee ;

    public Ouvrier(int matricule, String last_name, String first_name, Date birthday, Date date_entree,int anciennete_annee) {
        super(matricule, last_name, first_name, birthday);
        this.date_entree = date_entree;
        this.anciennete_annee = anciennete_annee;
    }

    @Override
    public String calculerSalaire() {
        double salaire = SMIG + (this.anciennete_annee * 100);
        if (salaire < (SMIG * 2)){
            this.salaire =salaire;
            return "Salaire calculated";
        }
        return "Salaire superieur de SMIG";
    }

    @Override
    public String calculerSalaire(double porcentage) {
        return null;
    }
    @Override
    public double getSalaire(){
        this.calculerSalaire();
        return salaire;
    }
}
