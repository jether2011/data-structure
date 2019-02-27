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
public class StackTest {
    public static void main(String[] args) {
        OwnStack<String> ownStack = new OwnStack<>();        
        ownStack.insert("Jether");
        ownStack.insert("Beatriz");
        
        System.out.println(ownStack);
        
        ownStack.remove();
        System.out.println(ownStack);
        
        System.out.println(ownStack.isEmpty());
        
        /**
         * Stack java.util
         */
        Stack<String> stack = new Stack<String>();
        stack.push("Denise");
        stack.push("Isabelly");
        System.out.println(stack);
        
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
