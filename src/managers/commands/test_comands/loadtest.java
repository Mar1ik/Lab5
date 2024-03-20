package managers.commands.test_comands;

import com.google.gson.Gson;
import data.Worker;
import managers.CollectionManager;
import managers.commands.BasicCommand;

import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class loadtest implements BasicCommand {
    @Override
    public void execute(String[] args) throws Exception {
        Gson gson = new Gson();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name of your downloaded file" + ".json");
        String filename = scanner.nextLine() + ".json";
        TreeMap<String, Worker> collectionManager;
        try (FileReader reader = new FileReader(filename)) {
            collectionManager = gson.fromJson(reader, TreeMap.class);
            TreeMap<String, Worker> table = CollectionManager.getTable();
            table.putAll(collectionManager);

        }
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
