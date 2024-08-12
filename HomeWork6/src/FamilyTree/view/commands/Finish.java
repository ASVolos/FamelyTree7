package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class Finish extends Command {

    public Finish(ConsoleUI consoleUI) {
        super("close the family tree", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
