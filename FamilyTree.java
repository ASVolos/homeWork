import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
//    private List<Human> familyMembers = new ArrayList<>();
    private List<Human> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();
    }

    public List<Human> getFamilyMember(String name) {
        List<Human> matchingMembers = new ArrayList<>();
        for (Human member : familyMembers) {
            if (member.getName().equals(name) || member.getSecondName().equals(name)) {
                matchingMembers.add(member);
            }
        }
        return matchingMembers;
    }

    public void addMember(Human human) {
        familyMembers.add((human));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("family tree:\n");
        for (Human familyMember : familyMembers) {
            stringBuilder.append(familyMember);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
