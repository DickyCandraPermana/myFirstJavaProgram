package uts;

import java.util.Scanner;

public class PersamaanKuadrat {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double a,
        b,
        c;
    double diskriminan;
    double akar1,
        akar2;
    String nilaiAkar;

    System.out.print("Masukkan nilai a(x^2): ");
    a = sc.nextDouble();

    if (a == 0) {
      System.out.println("Persamaan bukan persamaan kuadrat!");
      System.exit(0);
    }

    System.out.print("Masukkan nilai b(x): ");
    b = sc.nextDouble();

    System.out.print("Masukkan nilai c: ");
    c = sc.nextDouble();

    diskriminan = b * b - 4 * a * c;

    System.out.println("Persamaan kuadrat: " + a + "x^2 + " + b + "x + " + c);

    if (diskriminan < 0) {
      nilaiAkar = "Khayal";

      System.out.println("Memiliki akar " + nilaiAkar);
      if (a >= 0) {
        System.out.println("Memiliki definit positif(grafik selalu di atas sumbu x)");
      } else {
        System.out.println("Memiliki definit negatif(grafik selalu di bawah sumbu x)");
      }
    } else if (diskriminan == 0) {
      nilaiAkar = "Sama";

      akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
      System.out.println("Memiliki akar " + nilaiAkar);
      System.out.println("Memiliki akar yang sama" + akar1);
    } else {
      nilaiAkar = "Nyata";

      akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
      akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
      System.out.println("Memiliki akar " + nilaiAkar);
      System.out.println("Akar-akar persamaan kuadratnya adalah: " + akar1 + " dan " + akar2);
    }
  }
}
