package com.dima.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean firstTestBean = context.getBean("testBean", TestBean.class);
        TestBean secondTestBean = context.getBean("testBean", TestBean.class);

        boolean comparison = firstTestBean == secondTestBean;
        System.out.println(comparison);

        System.out.println(firstTestBean);
        System.out.println(secondTestBean);

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        System.out.println(firstMusicPlayer.getVolume());

        firstMusicPlayer.setVolume(25);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        firstMusicPlayer.playMusicList();
        secondMusicPlayer.playMusicList();

        context.close();
    }
}
