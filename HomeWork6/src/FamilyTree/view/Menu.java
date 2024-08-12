package FamilyTree.view;

import FamilyTree.view.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Command> commands;

    public Menu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AddMember(consoleUI));
        commands.add(new ReadTree(consoleUI));
        commands.add(new SortByName(consoleUI));
        commands.add(new SortByAge(consoleUI));
        commands.add(new AddChildren(consoleUI));
        commands.add(new Finish(consoleUI));
    }

    public String showMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Menu:\n");
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice){
        Command command = commands.get(choice - 1);
        command.execute();
    }
}
