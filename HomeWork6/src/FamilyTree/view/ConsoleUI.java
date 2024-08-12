package FamilyTree.view;

import FamilyTree.model.familyTree.FamilyTree;
import FamilyTree.model.human.Gender;
import FamilyTree.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private Menu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
        menu = new Menu(this);
    }

    @Override
    public void start() {
        System.out.print("Hi! ");
        while (work) {
            showMenu();
            selectAction();
        }
    }

    private void selectAction() {
        String choiceStr = scanner.nextLine();
        int choice = Integer.parseInt(choiceStr);
        menu.execute(choice);
    }

    private void showMenu() {
        System.out.println(menu.showMenu());
    }

    public void finish() {
        work = false;
        System.out.println("GoodBay!");
    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void addMember() {
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input secondName:");
        String secondName = scanner.nextLine();
        System.out.println("Input date of birth (format: \"yyyy-MM-dd\"):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
//        System.out.println("Input date of death (format: \"yyyy-MM-dd\"):");
//        LocalDate deathDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Input gender:");
        Gender gender = Gender.valueOf(scanner.nextLine());
        presenter.addMember(name, secondName, birthDate, gender);
    }

    public void addChildren() {
        readTree();
        System.out.println("Choice the parent's ID");
        int idParent = scanner.nextInt();
        System.out.println("Choice the children's ID");
        int idChildren = scanner.nextInt();
        presenter.addChildren(idParent, idChildren);
    }

    @Override
    public void printAnswer(FamilyTree answer) {
        System.out.println(answer);
    }

    public void readTree() {
        presenter.readTree();
    }
}
