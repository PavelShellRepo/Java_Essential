package java_essential.homework3.classroom;

public class ClassRoom {
    private final Pupil pupil1;
    private final Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
    }

    public void showClassroomInfo() {
        System.out.println("Classroom Information:");
        System.out.println("Pupil 1:");
        pupil1.study();
        pupil1.read();
        pupil1.write();
        pupil1.relax();
        System.out.println("Pupil 2:");
        pupil2.study();
        pupil2.read();
        pupil2.write();
        pupil2.relax();
        System.out.println("Pupil 3:");
        pupil3.study();
        pupil3.read();
        pupil3.write();
        pupil3.relax();
        System.out.println("Pupil 4:");
        pupil4.study();
        pupil4.read();
        pupil4.write();
        pupil4.relax();
    }
}

