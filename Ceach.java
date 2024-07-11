import java.util.Scanner;

public class Ceach {
    public static void ceachPersonByName(Scanner sc, FamilyTree familyTree) {
        System.out.println("Введите имя человека, которого нужно найти: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Human person : familyTree.getFamilyMember(name)) {
            if (person.getName().equals(name) || person.getSecondName().equals(name)) {
                System.out.println(person + System.lineSeparator());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Человек с таким именем не найден.");
        }
    }
}
