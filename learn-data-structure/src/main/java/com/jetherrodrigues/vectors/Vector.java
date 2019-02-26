package com.jetherrodrigues.vectors;

import com.jetherrodrigues.domain.Student;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author jether
 */
public class Vector {
   
    private int length = 100;
    private int totalStudents = 0;
    private Student[] students = new Student[this.length];

    /**
     * This method loop into the students array and when find the first null add the object. 
     * @param student 
     */
    public void add(Student student) {
        this.guarantee();
        this.students[totalStudents] = student;
        this.totalStudents++;
    }
    
    public void add(int position, Student student) {
        this.guarantee();
        
        for (int i = totalStudents; i >= position; i-=1) {
            students[i+1] = students[i];
        }
        students[position] = student;
        totalStudents++;
    }
    
    /**
     * @param position
     * @return the found Student
     */
    public Student get(int position) {
        if(this.isPositionValid(position)) {
            throw new IllegalArgumentException("The position is not a valid position");
        }
        return this.students[position];
    }

    /**
     * This method remove the student in the position
     * @param position 
     */
    public void remove(int position) {
        if(this.isPositionValid(position)) {
            throw new IllegalArgumentException("The position is not a valid position");
        }
        
        for (int i = position; i < totalStudents; i++) {
            this.students[i] = this.students[i+1];
        }
    }

    /**
     * This method has a complexity O(n)
     * 
     * @param s - Student
     * @return true if the student was found
     */
    public boolean contains(Student s) {
        boolean contain = false;
        
        for(int i = 0; i < students.length; i++) {
            Student student = students[i];            
            if(student.equals(s)) {
                contain = true;
                break;
            }
        }
        return contain;
    }

    public int length() {
        return this.totalStudents;
    }

    @Override
    public String toString() {
        return Arrays                
                .toString(this.students);
    }
    
    private boolean isPositionValid(int position) {
        return position >= 0 && position < totalStudents;
    }
    
    private void guarantee() {
        if(totalStudents == students.length) { 
            this.length *= 2;
        }
    }    
}
