package delegation;

public class Regular implements FilmType {
    @Override
    public int getPrice(int days) {
        return days * 2;
    }
    @Override
    public int getBonus(int days) {
        return days * 0;
    }
}
