package java_essential.homework4.Player;

public class Player implements Recordable, Playable {
    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void pause() {
        System.out.println("Pause music");
    }

    public void stop() {
        System.out.println("Stop music");
    }

    @Override
    public void record() {
        System.out.println("Recording...");
    }
}
