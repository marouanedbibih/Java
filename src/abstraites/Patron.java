package abstraites;

import java.util.Date;

public class Patron  extends Employe{
    private double ca;

    public Patron(int matricule, String last_name, String first_name, Date birthday, double ca) {
        super(matricule, last_name, first_name, birthday);
        this.ca = ca;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    @Override
    public String calculerSalaire() {
        return null;
    }

    @Override
    public String calculerSalaire(double porcentage) {
        if (porcentage > 0 && porcentage < 1){
            double salaire = (this.ca * porcentage) / 100;
            this.salaire = salaire;
            return "Salaire is calculated";
        }
        return "Salaire calculated";
    }

    public double getSalaire(double porcentage){
        this.calculerSalaire(porcentage);
        return salaire;
    }
}
