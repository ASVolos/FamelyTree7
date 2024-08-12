package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class ReadTree extends Command {

    public ReadTree(ConsoleUI consoleUI) {
        super("Read family tree", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().readTree();
    }
}
