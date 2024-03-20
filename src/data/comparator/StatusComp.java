package data.comparator;

import data.Worker;

import java.util.Comparator;

public class StatusComp implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getStatus().compareTo(o2.getStatus());
    }
}
