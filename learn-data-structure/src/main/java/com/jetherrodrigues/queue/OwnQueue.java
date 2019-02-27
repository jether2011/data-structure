/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.queue;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jether
 */
public class OwnQueue<T> {
    private List<T> values = new LinkedList<>();

    public void insert(T t) {
        values.add(t);
    }
    
    public void remove() {
        values.remove(0);
    }
    
    public boolean isEmpty() {
        return values.isEmpty();
    }
    
    @Override
    public String toString() {
        return "OwnQueue{" + "values=" + values + '}';
    }
}
