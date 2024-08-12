package FamilyTree.presenter;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.human.Gender;
import FamilyTree.model.service.Service;
import FamilyTree.view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addMember(String name, String secondName, LocalDate birthDate, Gender gender) {
        service.addMember(name, secondName, birthDate, gender);
        readTree();
    }

    public void readTree() {
        FamilyTree answer = service.readTree();
        view.printAnswer(answer);
    }


    public void sortByName() {
        service.sortByName();
    }

    public void sortByAge() {
        service.sortByAge();
    }

    public void addChildren(int idParent, int idChildren) {
        service.addChildren(idParent, idChildren);
        readTree();
    }
}
