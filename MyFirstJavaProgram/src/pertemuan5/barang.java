package pertemuan5;

import java.util.Scanner;

public class barang {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // Deklarasi variabel
      final double hargaA = 1000;
      final double hargaB = 2000;
      final double diskonA = 0.1;
      final double diskonB = 0.05;
      double jumlahA, jumlahB, totalA, totalB, total;
      // Input data
      System.out.print("Masukkan jumlah barang A: ");
      jumlahA = sc.nextDouble();
      System.out.print("Masukkan jumlah barang B: ");
      jumlahB = sc.nextDouble();
      // Hitung data
      totalA = (hargaA * jumlahA) * (1 - diskonA);
      totalB = (hargaB * jumlahB) * (1 - diskonB);
      total = totalA + totalB;

      // Output data

      if (total > 500000) {
        System.out.println("Utang sek ya mas..");
      } else {
        System.out.println("Total belanja: " + total);
      }
    }
  }
}
