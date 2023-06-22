package java_essential.homework7.multiple_inheritance;

public class Mobile extends Computer {
    Phone createPhone() {
        return new Phone() {
            @Override
            void process() {
                super.process();
                System.out.println("Mobile");
            }
        };
    }

    @Override
    void process() {
        super.process();
        System.out.println("Mobile");
    }
}
