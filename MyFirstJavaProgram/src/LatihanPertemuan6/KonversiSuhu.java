package LatihanPertemuan6;

import java.util.Scanner;

public class KonversiSuhu {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double suhuAwal, suhuAkhir;
    char convertTo;

    System.out.print("Masukkan suhu awal dalam Celcius: ");
    suhuAwal = sc.nextDouble();
    sc.nextLine();
    System.out.print("Konvert ke (R/F/K): ");
    convertTo = sc.nextLine().charAt(0);

    switch (convertTo) {
      case 'R' -> suhuAkhir = suhuAwal * 4 / 5;
      case 'F' -> suhuAkhir = suhuAwal * 9 / 5 + 32;
      case 'K' -> suhuAkhir = suhuAwal + 273.15;
      default -> {
        System.out.println("Inputan tidak valid");
        suhuAkhir = 0;
      }
    }

    System.out.println("Suhu akhir: " + suhuAkhir);
  }
}
