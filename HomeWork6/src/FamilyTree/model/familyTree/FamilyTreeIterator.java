package FamilyTree.model.familyTree;

import FamilyTree.model.human.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator {

    class HumanIterator implements Iterator<Human> {
        private int currentId;
        private List<Human> humans;


        public HumanIterator(List<Human> students) {
            this.humans = humans;
        }

        @Override
        public boolean hasNext() {
            return humans.size() > currentId;
        }

        @Override
        public Human next() {
            return humans.get(currentId++);
        }
    }
}
