package managers.commands;

import managers.CollectionManager;

public class ShowCMD implements BasicCommand {
    @Override
    public void execute(String[] args) throws Exception {
        System.out.println(CollectionManager.getTable());
    }

    @Override
    public String getDescription() {
        return "this command is showing your collection";
    }

    @Override
    public String getName() {
        return "show";
    }
}
