package com.dima.springcourse;

import org.springframework.stereotype.Component;

@Component("rapMusicBean")
public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "99 problems";
    }
}
