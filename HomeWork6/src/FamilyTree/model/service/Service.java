package FamilyTree.model.service;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.human.Gender;
import FamilyTree.model.human.Human;
import FamilyTree.model.writer.FileHandler;

import java.time.LocalDate;

public class Service {
    public FamilyTree<Human> familyTree;
    public Human human;

    public Service() {
        familyTree = new FamilyTree<>();
        human = new Human();
    }

    public void setFamilyTree(FamilyTree<Human> familyTree) {
        this.familyTree = familyTree;
    }

    public void saveTree(FamilyTree<Human> familyTree) {
        FileHandler fileHandler = new FileHandler();
        fileHandler.serializeFamily(familyTree);
    }

    public FamilyTree readTree() {
        FileHandler fileHandler = new FileHandler();
        return (FamilyTree) fileHandler.deserializeFamily();
    }

    public void sortByName() {
        familyTree.sortByName();
    }

    public void sortByAge() {
        familyTree.sortByAge();
    }

    public void addMember(String name, String secondName, LocalDate birthDate, Gender gender) {
        familyTree.addMember(new Human(name, secondName, birthDate, gender));
        saveTree(familyTree);
    }

    public void addChildren(int idParent, int idChildren) {
        familyTree.addChildren(idParent, idChildren);
    }
}
