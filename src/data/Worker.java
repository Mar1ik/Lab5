package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import data.randomizer.IdRandomizer;

public class Worker implements Comparable<Worker> {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float salary; //Значение поля должно быть больше 0
    private java.util.Date endDate; //Поле может быть null
    private Position position; //Поле не может быть null
    private Status status; //Поле может быть null
    private String organization; //Поле не может быть null

    public Worker(long id, String name, Coordinates coordinates, ZonedDateTime creationDate, float salary, Date endDate, Position position, Status status, String organization) {
        this.id = IdRandomizer.generatedID();
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDateTime.now();
        this.salary = salary;
        this.endDate = endDate;
        this.position = position;
        this.status = status;
        this.organization = organization;
    }

    public Worker(Long id) {
        this.id = IdRandomizer.generatedID();;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDateTime.now();
        this.salary = salary;

    }

    public Worker() {
        this.id =IdRandomizer.generatedID();
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDateTime.now();
        this.salary = salary;
        this.endDate = endDate;
        this.position = position;
        this.status = status;
        this.organization = organization;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public float getSalary() {
        return salary;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Position getPosition() {
        return position;
    }

    public Status getStatus() {
        return status;
    }

    public String getOrganization() {
        return organization;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = LocalDateTime.from(creationDate);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", salary=" + salary +
                ", endDate=" + endDate +
                ", position=" + position +
                ", status=" + status +
                ", organization='" + organization + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
       return  (int) (this.id - o.getId());
    }
}
