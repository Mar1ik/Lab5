package managers.commands;

import data.comparator.TestComp;

public class TestCMD implements BasicCommand {
    @Override
    public void execute(String[] args) throws Exception {
        TestComp testComp = new TestComp();
        testComp.sumSalary();
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return "test";
    }
}
