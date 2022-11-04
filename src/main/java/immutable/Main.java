package immutable;

public class Main {
    public static void main(String[] args) {
        ImmutableDemo demo = new ImmutableDemo("Petro", 23);
        Demo2 demo2 = new Demo2(new int[3]);
        System.out.println(demo2);
        int[] data = demo2.getData();
        data[1] = 2;

        System.out.println(demo2);

        DemoRecord record = new DemoRecord("Vasyl", 24);
        System.out.println(record);

        int age = record.age();
        String name = record.name();
    }
}
