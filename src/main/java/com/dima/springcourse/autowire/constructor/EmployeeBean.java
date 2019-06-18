package com.dima.springcourse.autowire.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
    private String fullName;

    @Autowired(required = false)
    @Qualifier("finance")
    private DepartmentBean departmentBean;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }
}
