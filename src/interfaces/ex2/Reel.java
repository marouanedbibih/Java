package interfaces.ex2;

public class Reel implements IOperation,IAffichage {
    private int reel;

    public Reel(int reel) {
        this.reel = reel;
    }

    public int getReel() {
        return reel;
    }

    public void setReel(int reel) {
        this.reel = reel;
    }

    @Override
    public String affiche() {
        return "Reel number : " + this.reel;
    }

    @Override
    public Object plus(Object object) {
        Reel reel = (Reel) object;
        int r = this.reel + reel.reel;
        return new Reel(r);
    }

    @Override
    public Object moins(Object object) {
        Reel reel = (Reel) object;
        int r = this.reel - reel.reel;
        return new Reel(r);
    }
}
