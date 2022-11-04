package mi;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Person[] people = {p, t};

        for (Person person : people) {
            if (person instanceof Student) {
                person.study();
            } else {
                person.work();
            }
        }
    }
}
