/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jetherrodrigues;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 *
 * @author jether
 */
public class AscendingBinarySorting {
    public static void main(String[] args) throws IOException {
        //List<Integer> r1 = Result.rearrange(Arrays.asList(1,2,3));
        //System.out.println(r1);
        
        List<Integer> r2 = Result.rearrange(Arrays.asList(7,8,6,5)); //8,5,6,7
        System.out.println(r2);
        
        List<Integer> r3 = Result.rearrange(Arrays.asList(5,3,7,10,14)); //3,5,10,7,14
        System.out.println(r3);        
    }
}


class Result {

    /*
     * Complete the 'rearrange' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY elements as parameter.
     */

    public static List<Integer> rearrange(List<Integer> elements) {
        Collections.sort(elements);
        
        Map<String, Integer> map = new HashMap<>();
        elements.stream().forEach(e -> {            
            int v = countNumbers(e, 1);
            map.put(String.valueOf(e), v);
        });
        
        System.out.println(map);
        
        List<Integer> values = new ArrayList<>();
        
        Map<String, Integer> sorted = map
                                    .entrySet()
                                    .stream()
                                    .sorted(Map.Entry.comparingByValue())                                    
                                    .collect(
                                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println(sorted);
        
        sorted.forEach((k, v) -> {
            values.add(Integer.parseInt(k));
        });
        
        return values;
    }
    
    private static int countNumbers(int toTransformInBinary, int numberToCompare) {
        String toCompare = Integer.toBinaryString(toTransformInBinary);
        int count = 0;        
        for(int i = 0; i < toCompare.length(); i++) {
            int v = Integer.parseInt(Character.toString(toCompare.charAt(i)));
            if(numberToCompare == v) count++;
        }
        return count;
    }

}