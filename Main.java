import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();
        Scanner sc = new Scanner(System.in);

        Human person1 = new Human("John", "Wick", LocalDate.of(1982, 1, 1),
                Gender.male, new ArrayList<>());
        Human person2 = new Human("Natalie", "Portman", LocalDate.of(1989, 2, 3),
                Gender.female, new ArrayList<>());
        Human person3 = new Human("Johnsson", "Wick Jr.", LocalDate.of(2007, 4, 15),
                Gender.male, new ArrayList<>());
        Human person4 = new Human("Johnsdaughter", "Wick ", LocalDate.of(2012, 5, 23),
                Gender.female, new ArrayList<>());

        familyTree.addMember(person1);
        familyTree.addMember(person2);
        familyTree.addMember(person3);

        person1.getChildren().add(person3);
        person2.getChildren().add(person3);
        person1.getChildren().add(person4);
        person2.getChildren().add(person4);

// Поиск по имени или фамилии:
        Ceach.ceachPersonByName(sc, familyTree);
//        getFamilyMember(name);
    }
}
