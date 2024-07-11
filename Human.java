import java.time.LocalDate;
import java.util.List;


public class Human {
    private String name;
    private String secondName;
    private LocalDate dob;
    private Gender gender;
    private Human father, mother;
    private List<Human> children;

    public Human(String name, String secondName, LocalDate dob, Gender gender, List<Human> children) {
        this.name = name;
        this.secondName = secondName;
        this.dob = dob;
        this.gender = gender;
        this.children = children;
    }

    public Human() {

    }

    public String getName() {
        return name;

    }

    public String getSecondName() {
        return secondName;
    }

    public LocalDate getDob() {
        return dob;

    }

    public List<Human> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return " name: " + name + ", second name: " + secondName + ", gender: " + gender + ", date of born: " + dob
                + ", children: " + children;
    }
}
