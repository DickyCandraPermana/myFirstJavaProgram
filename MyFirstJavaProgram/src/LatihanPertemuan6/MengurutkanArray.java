package LatihanPertemuan6;

import java.util.Arrays;
import java.util.Scanner;

public class MengurutkanArray {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Masukkan panjang array: ");
    int panjangArray = sc.nextInt();
    int[] input = new int[panjangArray];
    int[] hasil;

    for (int i = 0; i < panjangArray; i++) {
      System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
      input[i] = sc.nextInt();
    }

    hasil = Urutkan(input);

    System.out.println(Arrays.toString(hasil));
  }

  public static int[] Urutkan(int[] array) {
    int[] hasil = Arrays.copyOf(array, array.length);
    int temp;

    for (int i = 0; i < hasil.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        for (int j = 0; j < hasil.length - 1; j++) {
          if (hasil[j] > hasil[j + 1]) {
            temp = hasil[j];
            hasil[j] = hasil[j + 1];
            hasil[j + 1] = temp;
          }
        }
        return Urutkan(hasil);
      }
    }
    return hasil;
  }
}
