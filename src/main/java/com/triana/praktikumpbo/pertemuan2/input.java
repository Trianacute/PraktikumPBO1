
package com.triana.praktikumpbo.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class input {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          System.out.print("Masukan nama :");
          String nama = input.nextLine();
          
          System.out.print("Masukan usia :");
          int usia = input.nextInt();
          
          System.out.println("Nama saya : ");
          System.out.println("Usia  saya : + tahun");
    }
}
