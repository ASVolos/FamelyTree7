package FamilyTree.model.human;

import FamilyTree.model.familyTree.ItemFamilyTree;

import java.util.Comparator;

public class HumanComparatorByName<T extends ItemFamilyTree<T>>  implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
