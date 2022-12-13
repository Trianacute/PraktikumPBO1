
package com.triana.praktikumpbo.pertemuan6;


public class Exception_example {
    public static void main(String[] args) {
        try{
            //pernyataan yang  berpotensi mengakibatkan Exception
            String[] siswa = new String[2];
            siswa [0] = "Wawan";
            siswa[1] ="Waid";
            siswa[2] = "Wanda";
            System.out.println(siswa[4]);
            
            //========================================
            int angka = 7;
            int hasil = angka/0;
            System.out.println(hasil);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(" Data Array yang ingin di keluarkan tidak ada");
        }catch (ArithmeticException ex2){
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
        }
    }
}