package java_essential.task_by_category.classes_and_objects;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int year;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public static class Main {
        public static void main(String[] args) {
            Car bmw = new Car("BMW", "M5 sport", "Black", 2022);
            System.out.println(bmw);
        }
    }
}
