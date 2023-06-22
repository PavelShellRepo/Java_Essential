package java_essential.homework7.Vehicles;

/*Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
строку с названием экземпляра, цветом и стоимостью автомобиля.*/

enum Vehicles {
    CAR(20000) {
        public String getColor() {
            return "Red";
        }

        public String toString() {
            return "Car - Color: " + getColor() + ", Cost: $" + getCost();
        }
    };

    private final int cost;

    Vehicles(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public abstract String toString();
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Vehicles.CAR);
    }
}
