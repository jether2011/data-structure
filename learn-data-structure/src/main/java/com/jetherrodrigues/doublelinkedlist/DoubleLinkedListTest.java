/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.doublelinkedlist;

import com.jetherrodrigues.linkedlist.*;

/**
 *
 * @author jether
 */
public class DoubleLinkedListTest {
    public static void main(String[] args) {
        DoubleLinkedList ll = new DoubleLinkedList();
        
        ll.beginAdd("Jether");
        System.out.println(ll);
        ll.beginAdd("Denise");
        System.out.println(ll);
        
        ll.add("Beatriz");
        System.out.println(ll);
        ll.add("Isabelly");
        System.out.println(ll);
        
        ll.add(2, "Nina");
        System.out.println(ll);
        
        System.out.println(ll.get(3));
        System.out.println(ll.get(4));
        
        System.out.println(ll.contains("Nina"));
        
        ll.remove(4);
        System.out.println(ll);
    }    
}
