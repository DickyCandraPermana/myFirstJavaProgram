package LatihanPertemuan6;

import java.util.Scanner;

public class Diskon {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double total;

    System.out.print("Masukkan total belanja: ");
    total = sc.nextDouble();

    if (total > 100000) {
      total = total - (total * 0.1);
    } else if (total > 50000) {
      total = total - (total * 0.05);
    }

    System.out.println("Total yang harus dibayar: " + total);
  }
}
