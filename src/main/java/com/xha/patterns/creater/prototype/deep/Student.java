package com.xha.patterns.creater.prototype.deep;

import java.io.Serializable;

/**
 * 学生
 *
 * @author Xu huaiang
 * @date 2023/07/13
 */
public class Student implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
