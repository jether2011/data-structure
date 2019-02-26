/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.linkedlist;

import com.jetherrodrigues.domain.Celula;
import com.jetherrodrigues.domain.Node;

/**
 *
 * @author jether
 */
public class LinkedList extends Celula<Node>{
    
    private Node first;
    private Node last;
    private int totalElements = 0;

    @Override
    public void beginAdd(String name) {
        Node node = Node.of(name, first);
        this.first = node;
        
        if (this.totalElements == 0) {
            this.last = this.first;
        }
        
        this.totalElements++;
    }

    @Override
    public void add(String value) {
        if (this.totalElements == 0) {
            this.beginAdd(value);
        } 
        else {
            Node node = Node.of(value, null);
            this.last.next(node);
            this.last = node;
            this.totalElements++;
        }
    }

    @Override
    public void add(int position, String value) {
        if (position == 0) {
            this.beginAdd(value);
        } else if (position == this.totalElements) {
            this.add(value);
        } else {
            Node previous = this.get(position -1);
            Node node = Node.of(value, previous.getNext());
            previous.next(node);
            this.totalElements++;
        }        
    }

    @Override
    public Node get(int position) {
        this.validatePosisition(position);
        
        Node current = first;        
        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }
        
        return  current;
    }

    @Override
    public void remove() {
        if(this.totalElements == 0) throw new IllegalArgumentException("Empty LinkedList!");
        
        this.first = this.first.getNext();
        this.totalElements--;
        
        if(this.totalElements == 0) this.last = null;
    }
    
    @Override
    public void remove(int position) {
        if (this.isPositionValid(position)) {
            Node previous = this.get(position - 1);            
            Node toRemove = this.get(position);
            previous.next(toRemove.getNext());
            this.totalElements--;
        }
    }

    @Override
    public int length() {
        return this.totalElements;
    }

    @Override
    public boolean contains(String value) {        
        boolean contain = false;
        Node current = first;
        
        if(current.getName().equals(value)) return true; 
        
        while(current.getNext() != null) {
            if(current.getName().equals(value)) {
                contain = true;
                break;
            }
            else {
                current = current.getNext();
            }
        }
        return contain;
    }
    
    private void validatePosisition(int position) {
        if(!isPositionValid(position)) {
            throw new IllegalArgumentException("Position is not valid!");
        }
    }
    
    private boolean isPositionValid(int position) {
        return position > 0 && position < this.totalElements;
    }

    @Override
    public String toString() {
        if(totalElements == 0) return "[]";
        
        Node current = first;
        
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");
        for (int i = 0; i < this.totalElements; i++) {
            String name = current == null ? "" : current.getName();
            builder.append(name).append(",");
            current = current.getNext();
        }
        builder.append(" ]");
        
        return builder.toString();
    }
}
