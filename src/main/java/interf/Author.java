package interf;

import java.time.LocalDate;

public class Author implements AuthorInterface {
    private String name;
    private LocalDate birthday;


    public Author(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return birthday.getYear();
    }

    public void setName(String name) {
        this.name = name;
    }

//    public LocalDate getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(LocalDate birthday) {
//        this.birthday = birthday;
//    }
}
