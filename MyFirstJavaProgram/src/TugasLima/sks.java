package TugasLima;

/*
 !! Pseudocode Aplikasi !!
 * 1. Program start
 * 2. Deklarasi variabel(bobotMtk, bobotAlg, nilaiMtk, nilaiAlg, rataRata, totNilai, totBobot);
 * 3. Input data(masukkan nilai Mata Kuliah Matematika, masukkan nilai Mata Kuliah Algoritma);
 * 4. Proses data(totNilai = ((bobotMtk * nilaiMtk) + (bobotAlg * nilaiAlg));
 * 5. Proses data(totBobot = (bobotAlg + bobotMtk);;
 * 6. Proses data(rataRata = totNilai / totBobot);
 * 7. Output data(nilai rata-rata: rataRata);
 * 8. Program end;
 */

import java.util.Scanner;

public class sks {
  public static void main(String[] args) {
    // Deklarasi variabel
    try (Scanner sc = new Scanner(System.in)) {
      final double bobotMtk = 3;
      final double bobotAlg = 2;
      double nilaiMtk, nilaiAlg, rataRata, totNilai, totBobot;
      // Input data
      System.out.print("Masukkan nilai Mata Kuliah Matematika: ");
      nilaiMtk = sc.nextDouble();
      System.out.print("Masukkan nilai Mata Kuliah Algoritma: ");
      nilaiAlg = sc.nextDouble();
      // Proses data
      totNilai = ((bobotMtk * nilaiMtk) + (bobotAlg * nilaiAlg));
      totBobot = (bobotAlg + bobotMtk);
      rataRata = totNilai / totBobot;
      // Output data
      System.out.println("Nilai rata-rata: " + rataRata);
    }
  }
}
