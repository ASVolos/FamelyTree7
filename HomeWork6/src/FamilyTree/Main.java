package FamilyTree;

import FamilyTree.view.ConsoleUI;
import FamilyTree.view.View;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        View view = new ConsoleUI();
        view.start();
    }
}