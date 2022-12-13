
package com.triana.praktikumpbo.pertemuan6;


public class Expetion {
    public static void main(String[] args) {
        try{
            //Pernyataan yang berorientasi exception
            int angka = 7;
            int hasil = angka/ 0;
            System.out.println(hasil);
        }catch (ArithmeticException ex){
            //pernyataan disini akan exsekusi jika exceprion 
            System.out.println(" Tidak boleh menggunakan pembagi dengan 0 (nol)");
        }
    }
}
