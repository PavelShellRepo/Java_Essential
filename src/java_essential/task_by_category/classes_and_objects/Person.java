package java_essential.task_by_category.classes_and_objects;

/*Создайте класс Person, который представляет человека.
Добавьте поля для имени, возраста и адреса. Напишите методы для получения и установки значений полей.
Создайте объекты класса Person и заполните их данными. Выведите информацию о каждом человеке.*/

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Main {
        public static void main(String[] args) {
            Person person1 = new Person("Pavel", 30, "Ukraine, Kiev");

            System.out.println(person1);
        }
    }
}
