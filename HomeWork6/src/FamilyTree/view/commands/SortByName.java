package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class SortByName extends Command {

    public SortByName(ConsoleUI consoleUI) {
        super("Sort by name", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByName();
    }
}
