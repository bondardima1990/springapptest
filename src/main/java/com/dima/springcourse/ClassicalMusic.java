package com.dima.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization in ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction in ClassicalMusic");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
