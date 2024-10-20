package malas;

import java.util.Scanner;

public class MencariNilaiTertentu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] array = { 10, 23, 45, 67, 89, 12, 34, 56, 78, 90 };

    System.out.print("Masukkan nilai yang ingin dicari: ");
    int cari = input.nextInt();

    boolean ditemukan = false;
    int index = -1;

    for (int i = 0; i < array.length; i++) {
      if (array[i] == cari) {
        ditemukan = true;
        index = i;
        break;
      }
    }

    if (ditemukan) {
      System.out.println("Nilai " + cari + " ditemukan pada indeks ke-" + index);
    } else {
      System.out.println("Nilai " + cari + " tidak ditemukan dalam array");
    }

    input.close();
  }
}
