package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class AddChildren extends Command {

    public AddChildren(ConsoleUI consoleUI) {
        super("Add a children", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addChildren();
    }
}
