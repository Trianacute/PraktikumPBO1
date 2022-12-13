
package com.triana.praktikumpbo.pertemuan6;
public class Finally {
    public static void main(String[] args) {
        try{
            //pernyataan yang berpotensi mengakibatkan Exception
            int angka = 10;
            int hasil = angka/0;
            System.out.println(hasil);
        }catch(ArithmeticException ex){
             // pernyataan disini akan di eksekusi jika terjadi Exception
           System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");  
        }finally{
            /*
            Pernyataan disini akan di eksekusi jika terjadi Exception
            Ataupun tidak terjadi Exception
            */
            System.out.println(" Program Diakhiri");
       
        }
    }
}
