package managers.commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import data.Worker;
import managers.CollectionManager;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class LoadCMD implements BasicCommand {
    @Override
    public void execute(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print name of your downloaded file" + ".json");
        String filename = scanner.nextLine() + ".json";
        TreeMap<String, Worker> collectionManager = CollectionManager.getTable();

        try {
            File file = new File(filename);
            ObjectMapper objectMapper = new ObjectMapper();
            collectionManager = objectMapper.readValue(file, TreeMap.class);
            //collectionManager = objectMapper.readValue(file, new TypeReference<TreeMap<String, Worker>>() {});
            TreeMap<String, Worker> table = CollectionManager.getTable();
            table.putAll(collectionManager);
            CollectionManager.setTable(table);
            System.out.println("Load has completed successfully");
        } catch (IOException e) {
            System.out.println("Error to read your file " + e.getMessage());
        }
    }

    @Override
    public String getDescription() {
        return "this command load a list from your saved json file";
    }

    @Override
    public String getName() {
        return "load";
    }
}
