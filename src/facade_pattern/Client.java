package facade_pattern;

import facade_pattern.pattern.DVDPlayer;
import facade_pattern.pattern.HomeTheaterFacade;
import facade_pattern.pattern.Projector;
import facade_pattern.pattern.SoundSystem;


// The Facade Pattern provides a simplified interface to a complex subsystem.
// It hides internal system details and exposes a single entry point to the client.


// A home theater system 🎬
// You have a DVD Player, Projector, Sound System, and Lights.
// Instead of turning each one on manually, you just press one button on the remote — the facade.


public class Client {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
