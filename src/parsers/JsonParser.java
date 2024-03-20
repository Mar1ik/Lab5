package parsers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import data.Worker;
import data.randomizer.WorkerGenerator;
import exceptions.BuildWorkerEX;
import exceptions.IdCopyEX;
import exceptions.WrongArgEX;
import managers.CollectionManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

import static managers.ScannerPars.Scan;

public class JsonParser {


    public JsonParser(TreeMap<String, Worker> table) throws WrongArgEX, IdCopyEX, BuildWorkerEX, IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        String filename = Scan();
        objectMapper.writeValue(new File(filename),table);
    }
}
