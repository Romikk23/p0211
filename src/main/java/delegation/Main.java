package delegation;

public class Main {
    public static void main(String[] args) {
        Film f = new Film();
        System.out.println(f.price(4));
        System.out.println(f.bonus(4));
        f.setType(Type.REGULAR);
        System.out.println(f.price(4));
        System.out.println(f.bonus(4));
        f.setType(Type.CHILDREN);
        System.out.println(f.price(4));
        System.out.println(f.bonus(4));

    }
}
