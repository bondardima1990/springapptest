package com.dima.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusicBean")
public class RockMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization in RockMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction in RockMusic");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
