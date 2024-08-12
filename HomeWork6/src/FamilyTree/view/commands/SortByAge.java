package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class SortByAge  extends Command {

    public SortByAge(ConsoleUI consoleUI) {
        super("Sort by age", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().sortByAge();
    }
}
