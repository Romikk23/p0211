package interf;

public interface First {
    default void print() {
        System.out.println("First");
    }
}
