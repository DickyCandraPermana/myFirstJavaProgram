/*
 ! Pseudocode !
 * 1. Program start
 * 2. Deklarasi variabel(input)
 * 3. Output("Masukkan angka: ")
 * 4. Input data(input)
 * 5. If(input < 0)
 *     a. Output("Angka yang dimasukkan tidak boleh bernilai negatif")
 * 6. Else
 *     a. If(input % 2 == 0)
 *        - Output("Angka yang dimasukkan adalah bilangan genap")
 *     b. Else
 *        - Output("Angka yang dimasukkan adalah bilangan ganjil")
 * 7. Program end
 */

package LatihanPertemuan6;

import java.util.Scanner;

public class MenentukanGanjilGenap {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.print("Masukkan angka: ");
    int input = sc.nextInt();

    if (input < 0) {
      System.out.println("Angka yang dimasukkan tidak boleh bernilai negatif");
      System.exit(0);
    }

    if (input % 2 == 0) {
      System.out.println("Angka yang dimasukkan adalah bilangan genap");
    } else {
      System.out.println("Angka yang dimasukkan adalah bilangan ganjil");
    }
  }
}
