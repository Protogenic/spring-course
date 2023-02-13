package org.example;

public class RockMusic implements Music {
    private RockMusic() {

    }

    public static RockMusic getRockMusic() {
        // If we use singleton, we still create only one object, even if in getRockMusic()
        // every method call we are using "new"
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Bring Me The Horizon - Sleepwalking";
    }

    public void doMyInit() {
        System.out.println("Initialization");
    }

    public void doMyDestroy() {
        System.out.println("Destruction");
    }
}
