package delegation;

public class Film {

    private Type type = Type.NEW_FILM;

    public void setType(Type type) {
        this.type = type;
    }

    // новинка (3)
    // дитячий (1)
    // звичайний (2)
    public int price(int days){
        return type.getPrice(days);
    }

    public int bonus(int days){
        return type.getBonus(days);
    }
}
