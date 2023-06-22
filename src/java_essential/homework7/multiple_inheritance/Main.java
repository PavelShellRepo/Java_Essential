package java_essential.homework7.multiple_inheritance;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        Computer[] computerStore = {computer1, computer2, mobile1};
        Phone[] phoneStore = {phone1, phone2, mobile2.createPhone()};

        for (Computer temp : computerStore) {
            temp.process();
        }

        System.out.println("--------------------");

        for (Phone temp : phoneStore) {
            temp.process();
        }
    }
}
