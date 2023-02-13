package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        RockMusic rockMusic = context.getBean("musicBean", RockMusic.class);
        System.out.println(rockMusic.getSong());

        /*//Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // Singleton - both pointing on the same object
        // Prototype - different objects for every "getBean"
        boolean linkCompare = firstMusicPlayer == secondMusicPlayer;
        boolean objectCompare = firstMusicPlayer.equals(secondMusicPlayer);

        System.out.println(linkCompare + " " + objectCompare);

        firstMusicPlayer.playMusic();

        firstMusicPlayer.setVolume(10);
        // Singleton - Since it pointing on the same object, volume changed for both links
        // Prototype - changing volume only on one device
        System.out.println("Volume: " + firstMusicPlayer.getVolume());
        System.out.println("Volume: " + secondMusicPlayer.getVolume());*/

        context.close();
    }
}
