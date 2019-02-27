/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.domain;

import java.util.Objects;

/**
 *
 * @author jether
 */
public class DoubleNode {
    private String name;
    private DoubleNode next;
    private DoubleNode previous;

    private DoubleNode(String name, DoubleNode next) {
        this.name = name;
        this.next = next;
    }
    
    public static DoubleNode of(String name, DoubleNode next) {
        return new DoubleNode(name, next);
    }
    
    public static DoubleNode of(String name) {
        return new DoubleNode(name, null) ;
    }
    
    public DoubleNode getNext() {
        return next;
    }

    public String getName() {
        return this.name;
    }
    
    public void next(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void previous(DoubleNode previous) {
        this.previous = previous;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.next);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DoubleNode other = (DoubleNode) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.next, other.next)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DoubleNode{" + "name=" + name + ", next=" + next + ", previous=" + previous + '}';
    }
}
