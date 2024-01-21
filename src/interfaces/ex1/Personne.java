package interfaces.ex1;

import java.util.Date;

public class Personne implements Personnable {
    private int id;
    private  String last_name;
    private String first_name;
    private Date birthday;
    private double salaire;
    private Profile profile;
    public Personne(int id, String last_name, String first_name, Date birthday, double salaire,Profile profile) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.birthday = birthday;
        this.salaire = salaire;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public Profile getProfile(){return profile;}

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public void afficher() {
        String personne;
        if (profile.getLibelle() == "directeur"){
            personne = "Je suis le directeur " + this.last_name + " " + first_name +  "ne le " + this.birthday + " mon salaire est" + this.calculerSalaire() ;
        }
        else {
            personne = "Je suis le employee " + this.last_name + " " + first_name +  "ne le " + this.birthday + " mon salaire est" + this.calculerSalaire() ;
        }
        System.out.println(personne);
    }
    @Override
    public double calculerSalaire() {
        if (profile.getLibelle() == "directeur"){
            return salaire * 1.2;
        }
        else {
            return salaire * 1.1;
        }
    }
}
