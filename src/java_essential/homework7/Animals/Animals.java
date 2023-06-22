package java_essential.homework7.Animals;

/* Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
должен возвращать название экземпляра и возраст животного.*/

enum Animals {
    CAT(15);

    private final int age;

    Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name() + " - Age: " + getAge();
    }
}
