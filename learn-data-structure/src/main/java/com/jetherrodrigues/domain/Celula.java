/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues.domain;

/**
 *
 * @author jether
 */
public abstract class Celula<T> {
    public abstract void beginAdd(String value);
    public abstract void add(String value);
    public abstract void add(int position, String value);
    public abstract T get(int position);
    public abstract void remove(int position);
    public abstract void remove();
    public abstract int length();
    public abstract boolean contains(String value);
    
}
