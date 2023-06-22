package java_essential.homework7.CoffeeSize;

public class Main {
    public static void main(String[] args) {
        CoffeeSize large = CoffeeSize.LARGE;
        System.out.println(large.getDescription());

        System.out.println("-----------------------");

        CoffeeSize medium = CoffeeSize.MEDIUM;
        System.out.println(medium.getDescription());

        System.out.println("-----------------------");

        CoffeeSize small = CoffeeSize.SMALL;
        System.out.println(small.getDescription());
    }
}
