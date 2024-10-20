package LatihanPertemuan6;

import java.util.Scanner;

/**
 *
 * @author candr
 */
public class MaksimalInteger {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int[] array = new int[3];
    int hasil = 0;

    for (int i = 0; i < array.length; i++) {
      System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
      array[i] = sc.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      if (array[i] > hasil) {
        hasil = array[i];
      }
    }
    System.out.println("Nilai terbesar adalah: " + hasil);
  }
}
