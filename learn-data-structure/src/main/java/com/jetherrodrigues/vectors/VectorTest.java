/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.vectors;

import com.jetherrodrigues.domain.Student;

/**
 *
 * @author jether
 */
public class VectorTest {
    public static void main(String[] args) {
        Student s1 = new Student("Jether");
        Student s2 = new Student("Andre");
        Student s3 = new Student("Luiz");
        Student s4 = new Student("Adeline");
        
        Vector students = new Vector();
        
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(1, s4);
        
        System.out.println(students.toString());
    }   
}
