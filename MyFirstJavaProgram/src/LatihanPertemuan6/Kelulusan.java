package LatihanPertemuan6;

import java.util.Scanner;

public class Kelulusan {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int nilai;

    System.out.print("Masukkan nilai: ");
    nilai = sc.nextInt();
    if (nilai < 0 || nilai > 100) {
      System.out.println("Nilai yang dimasukkan tidak valid");
    } else {
      if (nilai > 60) {
        if (nilai >= 80) {
          System.out.println("Mahasiswa lulus dengan nilai sangat baik");
        } else if (nilai >= 70) {
          System.out.println("Mahasiswa lulus dengan nilai baik");
        } else {
          System.out.println("Mahasiswa lulus dengan nilai cukup");
        }
      } else {
        System.out.println("Mahasiswa tidak lulus");
      }
    }
  }
}
