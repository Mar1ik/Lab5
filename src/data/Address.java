package data;

public class Address {
    private String zipCode; //Длина строки не должна быть больше 17, Поле не может быть null
    private Location town; //Поле может быть null

    public Address(String zipCode, Location town) {
        this.zipCode = zipCode;
        this.town = town;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Location getTown() {
        return town;
    }
}
