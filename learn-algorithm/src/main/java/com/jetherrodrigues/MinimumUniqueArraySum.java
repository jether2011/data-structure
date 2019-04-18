/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jether
 */
public class MinimumUniqueArraySum {

    public static int getMinimumUniqueSum(List<Integer> arr) {
        int sum = 0;
        List<Integer> newList = new ArrayList<>(arr.size());
        newList.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++) {
            int val = arr.get(i);
            while (newList.contains(val)) {
                val++;
            }
            newList.add(val);
        }

        for (int i = 0; i < newList.size(); i++) {
            sum += newList.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getMinimumUniqueSum(Arrays.asList(1, 2, 2)));
    }
}
