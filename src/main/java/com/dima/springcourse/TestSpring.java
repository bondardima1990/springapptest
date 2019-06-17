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

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getVolume());

        musicPlayer.setVolume(25);

        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer2.getVolume());

        musicPlayer.playMusicList();

        context.close();
    }
}
