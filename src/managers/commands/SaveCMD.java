package managers.commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import managers.CollectionManager;

import java.io.File;
import java.io.FileOutputStream;

import static managers.ScannerPars.Scan;

public class SaveCMD implements BasicCommand {

    @Override
    public void execute(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
        System.out.println("Print name");
        File filename = new File(Scan() + ".json");
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        String json = objectMapper.writeValueAsString(CollectionManager.getTable());
        fileOutputStream.write(json.getBytes());
        objectMapper.writeValue(new File(filename + ".json"), CollectionManager.getTable());
        System.out.println("Your programm has been saved");
    }

    @Override
    public String getDescription() {
        return "this command is saving your worker";
    }

    @Override
    public String getName() {
        return "save";
    }
}
