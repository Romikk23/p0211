package interf;

public interface Second {
    default void print() {
        System.out.println("Second");
    }
}
