package com.dima.springcourse.autowire.byName;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
    private String fullName;

    @Autowired
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
