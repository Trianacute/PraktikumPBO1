
package com.triana.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        System.out.println(" Panjang array: " + names.length);
        
        //memasukan nilai
        names[0] = "Rain";
        names[1]= "Thunder";
        names[2]="Strom";
        
        //menampilkan niliai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ":"+ names [i]);
            
                              }
                }
}
