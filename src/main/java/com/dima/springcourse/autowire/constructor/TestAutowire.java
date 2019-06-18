package com.dima.springcourse.autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/dima/springcourse/autowire/constructor/application-context.xml");

        EmployeeBean employeeBean = (EmployeeBean) context.getBean("employee");
        System.out.println(employeeBean.getFullName());
        System.out.println(employeeBean.getDepartmentBean().getName());
    }
}
