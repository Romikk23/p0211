package delegation;

enum Type implements FilmType{
    NEW_FILM(new NewFilm()),
    REGULAR(new Regular()),
    CHILDREN(new Children());

    private final FilmType type;

    Type (FilmType type) {
        this.type = type;
    }

    @Override
    public int getPrice(int days) {
        return this.type.getPrice(days);
    }

    @Override
    public int getBonus(int days) {
        return this.type.getBonus(days);
    }

}
