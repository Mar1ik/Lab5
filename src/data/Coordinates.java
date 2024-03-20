package data;

public class Coordinates {
    private int x; //Максимальное значение поля: 830, Поле не может быть null
    private float y; //Максимальное значение поля: 490

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public String
    toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
