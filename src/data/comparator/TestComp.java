package data.comparator;

import data.Worker;
import managers.CollectionManager;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TestComp {
    public void sumSalary(){
        TreeMap<String, Worker> table = CollectionManager.getTable();
        table.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .toList();

    }
}
