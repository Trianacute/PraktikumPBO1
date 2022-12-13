
package com.triana.praktikumpbo.pertemuan5;

import java.util.Scanner;


public class Daynamanic {
    public static void main(String[] args) {
        //deklarasi
        Scanner input = new Scanner(System.in);
        
        //membuat panjang array
        System.out.println(" -- Program input nilai --");
        System.out.println("Masukan jumlah matkul");
        int jml = input.nextInt();
        System.out.println();
        
        //membuat array
        
        int[] nilai = new int [jml];
        //memasukan jumlah
        
        for(int i=0; i<jml; i++){
            System.out.println(" Masukkan nilai ke-" + (i+1)+ ": ");
            nilai[i] = input.nextInt();
        }
        System.out.println();
        //menampilkan semua nilai
        
        for(int i=0; i<jml; i++){
            System.out.println(i+": "+ nilai [i]);
        }
    }

    }