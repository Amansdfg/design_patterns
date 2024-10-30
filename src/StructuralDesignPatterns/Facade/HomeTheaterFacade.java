package StructuralDesignPatterns.Facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, TheaterLights lights, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the theater...");
        lights.on();
        projector.off();
        soundSystem.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}
