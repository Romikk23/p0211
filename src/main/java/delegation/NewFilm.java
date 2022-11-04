package delegation;

public class NewFilm implements FilmType {
    @Override
    public int getPrice(int days) {
        return days * 3;
    }

    @Override
    public int getBonus(int days) {
        return days * 20;
    }
}
