package abstractclass;

public class Main {
    public static void main(String[] args) {
        Instrument drum = new Drum();
        Instrument violin = new Violin();
        Instrument piano = new Piano();
        drum.play("dfghfghfg");
        violin.play("aaaddsss");
        piano.play("kfdsdsd");
    }
}
