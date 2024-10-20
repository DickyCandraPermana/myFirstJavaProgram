// package pertemuan5;

import java.util.Scanner;

public class mobil {
  public static void main(String[] args) {

    // Deklarasi variabel
    try (Scanner sc = new Scanner(System.in)) {
      double kecepatanA, kecepatanB, jarak, jarakDariA, jarakDariB, waktu;
      // Input data
      System.out.print("Masukkan kecepatan mobil A(dalam KM/H): ");
      kecepatanA = sc.nextDouble();
      System.out.print("Masukkan kecepatan mobil B(dalam KM/H): ");
      kecepatanB = sc.nextDouble();
      System.out.print("Masukkan jarak(dalam KM): ");
      jarak = sc.nextDouble(); 
      // Proses data
      waktu = (jarak / (kecepatanA + kecepatanB));
      jarakDariA = (kecepatanA * waktu);
      jarakDariB = (kecepatanB * waktu);
      // Output data
      System.out.println("Waktu yang diperlukan: " + waktu);
      System.out.println("Jarak yang ditempuh mobil A: " + jarakDariA);
      System.out.println("Jarak yang ditempuh mobil B: " + jarakDariB);
    }
  }
}
