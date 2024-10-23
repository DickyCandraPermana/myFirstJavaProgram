package LatihanPertemuan6;

import java.util.Scanner;

public class TotalGaji {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int totalGaji;
    int kategoriGaji;

    System.out.print("Masukkan kategori gaji(1, 2, 3): ");
    kategoriGaji = sc.nextInt();

    switch (kategoriGaji) {
      case 1 -> totalGaji = 1000000;
      case 2 -> totalGaji = 2000000;
      case 3 -> totalGaji = 3000000 + (3000000 * 2 / 100);
      default -> {
        totalGaji = 0;
        System.out.println("Kategori gaji yang dimasukkan tidak valid");
      }
    }

    System.out.println("Gaji dengan kategori " + kategoriGaji + " = " + totalGaji);

  }
}
