package StructuralDesignPatterns.Facade;

public class HomeTheaterTest {

    public static void main(String[] args) {
        TheaterLights theaterLights = new TheaterLights();
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade=new HomeTheaterFacade(dvdPlayer,projector,theaterLights,soundSystem);
        homeTheaterFacade.watchMovie("Aman");
        homeTheaterFacade.endMovie();
    }

}
