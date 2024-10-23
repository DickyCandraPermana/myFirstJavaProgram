package pertemuan5;

import java.util.Scanner;

public class waktu {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // Deklarasi variabel
      int jamAwal, jamAkhir, menitAwal, menitAkhir, detikAwal, detikAkhir;
      double jamHasil = 0;
      double menitHasil = 0;
      double detikHasil = 0;
      String waktuAwal;
      String waktuAkhir;
      // Input data
      System.out.print("Masukkan waktu mulai(jj:mm:dd): ");
      waktuAwal = sc.nextLine();
      System.out.print("Masukkan waktu selesai(jj:mm:dd): ");
      waktuAkhir = sc.nextLine();
      // Proses data
      jamAwal = Integer.parseInt(waktuAwal.substring(0, 2));
      menitAwal = Integer.parseInt(waktuAwal.substring(3, 5));
      detikAwal = Integer.parseInt(waktuAwal.substring(6, 8));

      jamAkhir = Integer.parseInt(waktuAkhir.substring(0, 2));
      menitAkhir = Integer.parseInt(waktuAkhir.substring(3, 5));
      detikAkhir = Integer.parseInt(waktuAkhir.substring(6, 8));

      // Proses data detik
      if (detikAkhir >= detikAwal) {
        detikHasil += detikAkhir - detikAwal;
      } else {
        detikHasil += detikAkhir + 60 - detikAwal;
        menitHasil -= 1;
      }
      // Proses data detik end

      // Proses data menit
      if (menitAkhir >= menitAwal) {
        menitHasil += menitAkhir - menitAwal;
      } else {
        menitHasil += menitAkhir + 60 - menitAwal;
        jamHasil -= 1;
        System.out.println(jamHasil);
      }
      // Proses data menit end

      // Proses data jam
      if (jamAkhir >= jamAwal) {
        jamHasil += jamAkhir - jamAwal;
      }
      // Proses data jam end

      // Proses data end

      // Output data
      System.out.print("Dari " + waktuAwal + " sampai " + waktuAkhir + ", ");
      System.out.println(jamHasil + " jam, " + menitHasil + " menit, " + detikHasil + " detik");
    }
  }

}
