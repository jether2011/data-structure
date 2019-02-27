/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.doublelinkedlist;

import com.jetherrodrigues.domain.Celula;
import com.jetherrodrigues.domain.DoubleNode;

/**
 *
 * @author jether
 */
public class DoubleLinkedList extends Celula<DoubleNode>{
    
    private DoubleNode first;
    private DoubleNode last;
    private int totalElements = 0;

    @Override
    public void beginAdd(String name) {
        if (this.totalElements == 0) {
            DoubleNode node = DoubleNode.of(name);
            this.first = node;
            this.last = node;
        } else {
            DoubleNode node = DoubleNode.of(name, this.first);
            this.first.previous(node);
            this.first = node;
        }
        this.totalElements++;
    }

    @Override
    public void add(String value) {
        if (this.totalElements == 0) {
            this.beginAdd(value);
        } 
        else {
            DoubleNode node = DoubleNode.of(value);
            this.last.next(node);
            node.previous(this.last);
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
            DoubleNode previous = this.get(position -1);
            DoubleNode next = previous.getNext();
            DoubleNode node = DoubleNode.of(value, previous.getNext());
            previous.next(node);
            node.previous(previous);
            previous.next(node);
            next.previous(node);
            this.totalElements++;
        }        
    }

    @Override
    public DoubleNode get(int position) {
        this.validatePosisition(position);
        
        DoubleNode current = first;        
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
        if(position == 0) {
            this.remove();
        } else if (position == this.totalElements - 1) {
            this.removeInTheEnd();
        } else {
            DoubleNode previous = this.get(position - 1);            
            DoubleNode current = previous.getNext();
            DoubleNode next = current.getNext();
            
            previous.next(next);
            next.previous(previous);
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
        DoubleNode current = first;
        
        if(current.getName().equals(value)) return true; 
        
        while(current != null) {
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
        
    private void removeInTheEnd() {
        if (this.totalElements == 1) {
            this.remove();
        } else {
            DoubleNode beforeLast = this.last.getPrevious();
            beforeLast.next(null);
            this.last = beforeLast;
            this.totalElements--;
        }
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" + "first=" + first + ", last=" + last + ", totalElements=" + totalElements + '}';
    }

    
}
