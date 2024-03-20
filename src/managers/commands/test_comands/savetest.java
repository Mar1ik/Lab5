package managers.commands.test_comands;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import data.Worker;
import managers.CollectionManager;
import managers.commands.BasicCommand;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.TreeMap;

import static managers.ScannerPars.Scan;

public class savetest implements BasicCommand {
    @Override
    public void execute(String[] args) throws Exception {
        Gson gson = new Gson();
        System.out.println("Print name of yyour fiile");
        File filename = new File(Scan() + ".json");
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        Type maptype = new TypeToken<TreeMap<String, Worker>> () {}.getType();
        TreeMap<String, Worker> table = CollectionManager.getTable();
        String json = gson.toJson(maptype, TreeMap.class);
        fileOutputStream.write(json.getBytes());

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
