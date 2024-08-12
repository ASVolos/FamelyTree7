package FamilyTree.view.commands;

import FamilyTree.view.ConsoleUI;

public class AddMember extends Command {

    public AddMember(ConsoleUI consoleUI) {
        super("Add a member", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addMember();
    }
}
