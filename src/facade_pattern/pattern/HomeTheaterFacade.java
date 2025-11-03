package facade_pattern.pattern;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("\n--- Getting ready to watch a movie ---");
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(8);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("--- Movie started! Enjoy 🎬 ---\n");
    }

    public void endMovie() {
        System.out.println("\n--- Shutting down theater ---");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        System.out.println("--- Theater system off ---\n");
    }
}
