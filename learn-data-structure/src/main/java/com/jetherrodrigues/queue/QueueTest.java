/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.queue;

/**
 *
 * @author jether
 */
public class QueueTest {
    public static void main(String[] args) {
        OwnQueue<String> ownQueue = new OwnQueue<>();
        ownQueue.insert("Mauricio");
        ownQueue.insert("Paulo");
        ownQueue.insert("Guilherme");
        
        ownQueue.remove();
        
        ownQueue.insert("Joao");
        
        ownQueue.remove();

        System.out.println(ownQueue);
    }
}
