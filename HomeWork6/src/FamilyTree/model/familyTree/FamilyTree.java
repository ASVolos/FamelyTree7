package FamilyTree.model.familyTree;

import FamilyTree.model.human.Human;
import FamilyTree.model.human.HumanComparatorByAge;
import FamilyTree.model.human.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends ItemFamilyTree<E>> implements Serializable, Iterable<E> {
    private long id;
    private List<E> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();
    }

    public void addMember(E human) {
        familyMembers.add((human));
        human.setId(id++);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("family tree:\n");
        for (E familyMember : familyMembers) {
            stringBuilder.append(familyMember);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        familyMembers.sort(new HumanComparatorByName<>());
    }

    public void sortByAge() {
        familyMembers.sort(new HumanComparatorByAge<>());
    }

    @Override
    public Iterator<E> iterator() {
        return familyMembers.iterator();
    }

    public void addChildren(int idParent, int idChildren) {
        Human parent = (Human) familyMembers.get(idParent);
        Human children = (Human) familyMembers.get(idChildren);
        parent.addChildren().add(children);
    }
}