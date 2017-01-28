package pl.sda;

/**
 * Created by RENT on 2017-01-28.
 */
public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int doors;
    private int id;

    public Car() {
    }

    public Car(String brand, String model, int year, String color, int doors, int id) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.doors = doors;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", doors=" + doors +
                ", id=" + id +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
