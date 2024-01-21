package abstraites;

import java.util.Date;

public abstract class Employe {
    protected int matricule;
    protected String last_name;
    protected String first_name;
    protected Date birthday;
    protected double salaire;

    public Employe(int matricule, String last_name, String first_name, Date birthday) {
        this.matricule = matricule;
        this.last_name = last_name;
        this.first_name = first_name;
        this.birthday = birthday;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "matricule=" + matricule +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", birthday=" + birthday + '\'' +
                ", salaire= " + salaire + '\'' +
                '}';
    }

    public abstract String calculerSalaire();
    public abstract String calculerSalaire(double porcentage);

}
