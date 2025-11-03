package facade_pattern.pattern;

public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}