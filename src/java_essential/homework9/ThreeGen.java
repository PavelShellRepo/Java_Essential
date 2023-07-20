package java_essential.homework9;

public class ThreeGen<T extends String, V extends Animal, K extends Number> {
    private T obj1;
    private V obj2;
    private K obj3;

    public ThreeGen(T obj1, V obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void showTypes() {
        System.out.println("obj1: " + obj1.getClass().getName());
        System.out.println("obj2: " + obj2.getClass().getName());
        System.out.println("obj3: " + obj3.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeGen<String, Cat, Integer> treeGen = new ThreeGen<>("Str", new Cat(), 13);
        treeGen.showTypes();
    }
}
