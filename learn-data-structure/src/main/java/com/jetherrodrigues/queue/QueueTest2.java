/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author jether
 */
public class QueueTest2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Jether");
        queue.add("Denise");
        
        System.out.println(queue);
    }    
}
