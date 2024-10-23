package uts;

import java.util.Scanner;

public class Gaji {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int gajiPokok = 0;
    int gajiKotor, gajiBersih;
    char golonganGaji;
    int jumlahAnak = 0;
    int tunjanganKeluarga = 0;
    int tunjanganAnak = 0;
    boolean sudahKeluarga = false;

    // Input golongan gaji
    System.out.print("Masukkan golongan gaji (1, 2, 3): ");
    golonganGaji = sc.nextLine().charAt(0);

    // Tentukan gaji pokok berdasarkan golongan
    switch (golonganGaji) {
      case '1' -> gajiPokok = 1000000;
      case '2' -> gajiPokok = 2000000;
      case '3' -> gajiPokok = 3000000;
      default -> {
        System.out.println("Golongan gaji yang dimasukkan tidak valid.");
        System.exit(0); // Keluar dari program jika input tidak valid
      }
    }

    // Tanya apakah sudah berkeluarga
    System.out.print("Apakah sudah berkeluarga? (y/t): ");
    char isKeluarga = sc.nextLine().charAt(0);

    // Jika sudah berkeluarga, tambahkan tunjangan keluarga dan anak
    if (isKeluarga == 'y' || isKeluarga == 'Y') {
      tunjanganKeluarga = 300000; // Tunjangan keluarga
      sudahKeluarga = true;

      // Tanya jumlah anak
      System.out.print("Masukkan jumlah anak: ");
      jumlahAnak = sc.nextInt();

      if (jumlahAnak < 0) {
        System.out.println("Jumlah anak yang dimasukkan tidak valid.");
        System.exit(0); // Keluar dari program jika input tidak valid
      }

      // Maksimal tunjangan untuk 3 anak
      if (jumlahAnak > 3) {
        jumlahAnak = 3;
      }

      tunjanganAnak = 100000 * jumlahAnak; // Tunjangan per anak
    }

    // Hitung gaji kotor (gaji pokok + tunjangan keluarga + tunjangan anak)
    gajiKotor = gajiPokok + tunjanganKeluarga + tunjanganAnak;

    // Pajak hanya untuk golongan 3
    if (golonganGaji == '3') {
      gajiBersih = gajiKotor - (gajiKotor * 2 / 100); // Pajak 2%
    } else {
      gajiBersih = gajiKotor; // Tidak ada pajak
    }

    // Output hasil perhitungan
    System.out.println("\nGaji Pokok: Rp" + gajiPokok);
    if (sudahKeluarga) {
      System.out.println("Tunjangan Keluarga: Rp" + tunjanganKeluarga);
      System.out.println("Tunjangan Anak: Rp" + tunjanganAnak + " (untuk " + jumlahAnak + " anak)");
    }
    System.out.println("Gaji Kotor: Rp" + gajiKotor);
    if (golonganGaji == '3') {
      System.out.println("Pajak 2% untuk Golongan 3: Rp" + (gajiKotor * 2 / 100));
    }
    System.out.println("Gaji Bersih: Rp" + gajiBersih);
  }
}
