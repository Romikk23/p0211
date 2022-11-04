package interf;

public class MyClass implements First, Second {

    @Override
    public void print() {
        Second.super.print();
    }
}
