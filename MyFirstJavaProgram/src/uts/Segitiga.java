package uts;

import java.util.Scanner;

public class Segitiga {
  static Scanner Input = new Scanner(System.in);

  public static void main(String[] args) {
    double sisiA, sisiB, sisiC;
    boolean isSegitiga;

    System.out.print("Masukkan panjang sisi A: ");
    sisiA = Input.nextDouble();
    System.out.print("Masukkan panjang sisi B: ");
    sisiB = Input.nextDouble();
    System.out.print("Masukkan panjang sisi C: ");
    sisiC = Input.nextDouble();

    if (sisiA + sisiB > sisiC && sisiA + sisiC > sisiB && sisiB + sisiC > sisiA) {
      isSegitiga = true;
    } else {
      System.out.println("Bukan segitiga!");
      isSegitiga = false;
    }

    if (isSegitiga) {
      if (sisiA == sisiB && sisiB == sisiC) {
        System.out.println("Segitiga sama sisi");
      } else if (Math.pow(sisiA, 2) + Math.pow(sisiB, 2) == Math.pow(sisiC, 2)) {
        System.out.println("Segitiga siku-siku");
      } else if (sisiA == sisiB || sisiA == sisiC || sisiB == sisiC) {
        System.out.println("Segitiga sama kaki");
      } else {
        System.out.println("Segitiga sembarang");
      }
    }
  }
}
