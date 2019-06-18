package com.dima.springcourse;

import org.springframework.stereotype.Component;

@Component
public class TestBean extends CustomBeanPostProcessor{
    private String name;

    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doMyInit() {
        System.out.println("Doing my initialization in TestBean");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction in TestBean");
    }
}
