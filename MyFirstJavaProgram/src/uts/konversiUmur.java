package uts;

import java.util.Scanner;

public class konversiUmur {
  static Scanner Input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Masukkan tanggal lahir(dd/mm/yyyy): ");
    String tanggalLahir = Input.nextLine();
    System.out.print("Masukkan tanggal sekarang(dd/mm/yyyy): ");
    String tanggalSekarang = Input.nextLine();

    String umur = hitungUmur(tanggalLahir, tanggalSekarang);
    System.out.println("Umur anda: " + umur);
  }

  public static String hitungUmur(String tanggalLahir, String tanggalSekarang) {
    String[] partsLahir = tanggalLahir.split("/");
    String[] partsSekarang = tanggalSekarang.split("/");
    String result;

    int tahunLahir = Integer.parseInt(partsLahir[2]);
    int bulanLahir = Integer.parseInt(partsLahir[1]);
    int hariLahir = Integer.parseInt(partsLahir[0]);
    int hariDariLahir = (tahunLahir * 30 * 12) + (bulanLahir * 30) + hariLahir;

    int tahunSekarang = Integer.parseInt(partsSekarang[2]);
    int bulanSekarang = Integer.parseInt(partsSekarang[1]);
    int hariSekarang = Integer.parseInt(partsSekarang[0]);
    int hariDariSekarang = (tahunSekarang * 30 * 12) + (bulanSekarang * 30) + hariSekarang;

    int selisihHari = hariDariSekarang - hariDariLahir;

    int umurTahun = selisihHari / (12 * 30);
    selisihHari = selisihHari % (12 * 30);
    int umurBulan = selisihHari / 30;
    int umurHari = selisihHari % 30;

    result = umurTahun + " tahun, " + umurBulan + " bulan, " + umurHari + " hari";

    return result;
  }
}
