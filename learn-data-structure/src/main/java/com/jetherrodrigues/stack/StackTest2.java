/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.stack;

import java.util.Stack;

/**
 *
 * @author jether
 */
public class StackTest2 {
    public static void main(String[] args) {
        OwnStack<String> ownStack = new OwnStack<>();        
        ownStack.insert("Mauricio");
        ownStack.insert("Marcelo");
        
        ownStack.remove();
                
        ownStack.insert("Guilherme");        
        ownStack.insert("Paulo");
        
        ownStack.remove();
        
        ownStack.insert("Joao");
        
        System.out.println(ownStack);
    }
}
