package java_essential.homework6;

/* Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door, которые
также должны содержать метод print. Создайте экземпляры классов Wheel и Door. */

public class Vehicle {
    void print() {
        System.out.println("Print Vehicle");
    }

    public static class Wheel {
        public void print() {
            System.out.println("Print Wheel");
        }
    }

        public static class Door {
            public void print() {
                System.out.println("Print Door");
            }
        }

        public static void main(String[] args) {
           Vehicle vehicle = new Vehicle();
           vehicle.print();

           Wheel wheel = new Wheel();
           wheel.print();

           Door door = new Door();
           door.print();
    }
}
