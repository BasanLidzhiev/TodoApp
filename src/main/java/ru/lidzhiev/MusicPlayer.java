package ru.lidzhiev;

import ru.lidzhiev.Music.Music;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
