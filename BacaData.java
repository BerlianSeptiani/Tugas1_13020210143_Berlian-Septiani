/* Nama : Berlian Septiani
   Nim : 13020210143
   Hari/Tanggal :Rabu,07 Maret 2023
   Waktu Pengerjaan : 00.32 */


import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner*/
    public class BacaData {
       
      public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print ("Contoh membaca dan menulis, ketik integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print ("Nilai yang dibaca : "+ a);
     }
}