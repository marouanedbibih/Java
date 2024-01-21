package interfaces.ex3;

public class Complexe extends Affichage implements IOperation  {

    private double im;
    private double re;

    public Complexe(double im, double re) {
        this.im = im;
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }
    public Object plus(Object c){
        Complexe complexe = (Complexe) c;
        double im = this.im + complexe.im;
        double re = this.re + complexe.re;
        return new Complexe(im,re);
    }
    public Object moins(Object c){
        Complexe complexe = (Complexe) c;
        double im = this.im - complexe.im;
        double re = this.re - complexe.re;
        return new Complexe(im,re);
    }

    public String affiche(){
        return "Imagine : " + this.im + " Reel : " + this.re;
    }


}
