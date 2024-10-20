package LatihanPertemuan6;

import java.util.Scanner;

public class PersamaanKuadrat {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double a,
        b,
        c;
    double diskriminan;
    double akar1 = 0,
        akar2 = 0;
    String nilaiAkar;

    System.out.print("Masukkan nilai a(x^2): ");
    a = sc.nextDouble();

    System.out.print("Masukkan nilai b(x): ");
    b = sc.nextDouble();

    System.out.print("Masukkan nilai c: ");
    c = sc.nextDouble();

    diskriminan = b * b - 4 * a * c;

    if (diskriminan < 0) {
      nilaiAkar = "Khayal";
    } else {
      akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
      akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
      if (diskriminan == 0) {
        nilaiAkar = "Sama";
      } else {
        nilaiAkar = "Nyata";
      }
    }

    System.out.println("Persamaan kuadrat: " + a + "x^2 + " + b + "x + " + c);
    System.out.println("Akar-akar persamaan kuadratnya adalah: " + akar1 + " dan " + akar2);
    System.out.println("Nilai akar persamaan kuadrat: " + nilaiAkar);
  }
}
