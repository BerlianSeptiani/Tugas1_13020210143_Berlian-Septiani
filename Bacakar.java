/* Nama : Berlian Septiani
   Nim : 13020210143
   Hari/Tanggal :Rabu,08 Maret 2023
   Waktu Pengerjaan : 00.46 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.Scanner;  // import packpage Class Scanner
import java.io.*;          // import packpage Class Console
import javax.swing.*;      // import packpage Class JOptionPane
   
 
    public class Bacakar {
          
         public static void main (String[] args) throws IOException {
           char cc; int bil;
         InputStreamReader isr = new 
         InputStreamReader (System.in);
         BufferedReader dataIn = new BufferedReader (isr);
         BufferedReader datAIn = new BufferedReader (new InputStreamReader (System.in));

/* Algoritma */
 System.out.print ("hello\n");
 System.out.print ("baca 1 karakter : ");

//perintah baca karakter cc
 cc =dataIn.readLine().charAt (0);
 System.out.print ("baca 1 bilangan : ");

//perintah baca bil
 bil =Integer.parseInt(datAIn.readLine());

 /*String kar = JOptionPane.showInputDialog("Karakter 1 : "); system.out.println(kar);*/
//JOptionPane.showMessageDialog (null,"hello");

         System.out.print (cc+"\n" +bil+"\n");

/* Tambahkan program membaca/input data menggunakan 
Class Scanner, Class Console dan Class JOptionPane */

// input & output/membaca class Scanner
System.out.println("\nBerikut adalah penggunaan Class Scanner");
System.out.println("Masukkan nilai : ");
Scanner masukan = new Scanner(System.in);
int a = masukan.nextInt();
System.out.println("Nilai yang dimasukkan adalah : "+a);

//input & output/membaca Class Console
System.out.println("\nBerikut adalah penggunaan Class Console");
System.out.println("Masukkan nilai : ");
Console input = System.console();
String c = input.readLine();
System.out.println("Nilai yang dimasukkan adalah : "+c);

/*input & output/membaca Class JOptionPane*/
JOptionPane.showMessageDialog(null,"Hello,\nBerikut adalah penggunaan Class JOptionPane,tekan enter");
String kar = JOptionPane.showInputDialog("Masukkan Karakter : ");
System.out.println("\nBerikut adalah penggunaan Class JOption.Pane \nKarakter yang baru saja dimasukkan : "+kar);

         System.out.print ("bye \n");

    }
}
