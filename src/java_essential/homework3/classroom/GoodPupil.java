package java_essential.homework3.classroom;

public class GoodPupil extends Pupil{
    @Override
    void study() {
        System.out.println("Good pupil is studying");
    }

    @Override
    void read() {
        System.out.println("Good pupil is reading");
    }

    @Override
    void write() {
        System.out.println("Good pupil is writing");
    }
}
