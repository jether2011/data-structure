/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jether
 */
public class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student)obj;
        return Objects.equals(this.name, other.getName());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Student [ name=").append(this.name).append("]");
        return builder.toString();
    }
}
