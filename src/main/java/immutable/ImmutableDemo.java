package immutable;

public class ImmutableDemo {
    private final String name;
    private final int age;

    public ImmutableDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
