package java_essential.homework6;

/* Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
измерения (к примеру, из метров в километры, из километров в мили, и так далее). */

public class Distance {
    private final double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println("Distance: " + distance + " meters");
    }

    public static class Converter {
        public static double metersToKilometers(double meters) {
            return meters / 1000.0;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }
    }

    public static void main(String[] args) {
        Distance distance1 = new Distance(5000);
        distance1.print();

        double kilometers = Converter.metersToKilometers(distance1.distance);
        System.out.println("Distance in kilometers: " + kilometers);

        double miles = Converter.kilometersToMiles(distance1.distance);
        System.out.println("Distance in miles: " + miles);
    }
}
