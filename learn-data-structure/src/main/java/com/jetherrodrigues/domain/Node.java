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
public class Node {
    private String name;
    private Node next;

    private Node(String name, Node next) {
        this.name = name;
        this.next = next;
    }
    
    public static Node of(String name, Node next) {
        return new Node(name, next);
    }
    
    public Node getNext() {
        return next;
    }

    public String getName() {
        return this.name;
    }
    
    public void next(Node next) {
        this.next = next;
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
        final Node other = (Node) obj;
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
        return "Node{" + "name=" + name + ", next=" + next + '}';
    }
}
