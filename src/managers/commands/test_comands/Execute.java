package managers.commands.test_comands;

import managers.Executer;
import managers.commands.BasicCommand;

public class Execute implements BasicCommand {
    private final Executer executer;

    public Execute(Executer executer) {
        System.out.println("Execute script");
        this.executer = executer;
    }

    @Override
    public void execute(String[] args) throws Exception {
        if (args[1].isEmpty()) {
            executer.println("Использование: '" + getName() + "'");
            System.out.println("hueta");;
        }

        executer.println("Выполнение скрипта '" + args[1] + "'...");
        System.out.println("script has complete");;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return "executer";
    }
}





