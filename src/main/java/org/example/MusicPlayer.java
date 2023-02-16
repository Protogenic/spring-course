package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private RockMusic rock;
    private ClassicalMusic classic;
    // IoC

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        // @Qualifier tells which bean use if there are multiple options
        this.rock = (RockMusic) music1;
        this.classic = (ClassicalMusic) music2;
    }

    public String playMusic(Genres genre) {
        if (genre == Genres.CLASSICAL) {
            return "Playing: " + classic.getSong();
        }
        if (genre == Genres.ROCK) {
            return "Playing: " + rock.getSong();
        }
        return "";
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // Can use @Autowired there
    /*public void setMusic(Music music) {
        this.music = music;
    }*/
}
