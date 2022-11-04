package abstractclass;

public class Violin extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.println("v : " + note);
    }
}
