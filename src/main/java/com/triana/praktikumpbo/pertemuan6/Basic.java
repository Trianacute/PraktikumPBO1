
package com.triana.praktikumpbo.pertemuan6;


public class Basic {
    public static void main(String[] args) {
        int [] myNumbers = {1, 2,3};
        
        try {
    
      
        System.out.println(myNumbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
        
        System.out.println("Array ga sebesar itu!");
        }
    }
}
