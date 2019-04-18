package com.jetherrodrigues;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class StdInStdOutII {

    public static void main(String[] args) {        
        printElements("-23123 \n 123123232 \n  m ");        
    }
    
    private static void printElements(String value) {
        Scanner scan = new Scanner(value);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = null;        
        
        while (scan.hasNext()) {
            s = scan.nextLine();            
        }

//        StringBuilder b = new StringBuilder();
//        while (scan.hasNext()) {  
////            b.append(scan.next());
////            if(scan.hasNext()) b.append(" ");
//        }
//        s = b.toString();
//        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        
        
        scan.close();
    }
}
