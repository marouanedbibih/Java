package abstraites;

import java.util.Date;

public class Cadre extends Employe {
    private int indice;

    public Cadre(int matricule, String last_name, String first_name, Date birthday, int indice) {
        super(matricule, last_name, first_name, birthday);
        this.indice = indice;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        if (indice >= 1 && indice <= 4){
            this.indice = indice;
        }
        throw new IllegalArgumentException("Indice should be between 1 and 4");

    }

    @Override
    public String calculerSalaire() {
        if (indice == 1){
            this.salaire = 13000.00;
            return "Salaire calculated";
        } else if (indice == 2) {
            this.salaire = 15000.00;
            return "Salaire calculated";
        }
        else if (indice == 3){
            this.salaire = 17000.00;
            return "Salaire calculated";
        }
        else if (indice == 4){
            this.salaire = 20000.00;
            return "Salaire calculated";
        }
        return "Salaire not calculated";
    }

    @Override
    public String calculerSalaire(double porcentage) {
        return null;
    }

    public double getSalaire(){
        this.calculerSalaire();
        return salaire;
    }
}
