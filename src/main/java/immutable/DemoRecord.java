package immutable;

public record DemoRecord(String name, int age) {
    @Override
    public String toString() {
        return "DemoRecord{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
