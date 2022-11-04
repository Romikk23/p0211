package interf;

public interface MyInterface {
    int x = 42;

    void print();

    default int max(int a, int b) {
        return Integer.max(a,b);
    }

    private int sum(int a, int b) {
        return a + b;
    }

}
