package pertemuan9;

import java.util.Scanner;

public class perulangan {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    boolean isCounting = true;
    int temp;

    while (isCounting) {
      System.out.print("Ingin mengulang berapa kali? ");
      temp = sc.nextInt();
      System.out.println("---------------------------------");
      for (int i = 0; i < temp; i++) {
        System.out.println("Perulangan ke-" + (i + 1));
      }
      System.out.println("---------------------------------");
      for (int i = 0; i < temp; i++) {
        System.out.println("Huruf ganjil ke-" + (i + 1) + " = " + (i * 2 + 1));
      }
      System.out.println("---------------------------------");
      for (int i = 0; i < temp; i++) {
        System.out.println("Huruf genap ke-" + (i + 1) + " = " + ((i + 1) * 2));
      }
      System.out.println("---------------------------------");

      System.out.println("Ingin mengulang lagi(y/t)? ");
      if (sc.next().equals("t")) {
        isCounting = false;
      }
    }
  }
}
