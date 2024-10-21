package pertemuan5.pertemuan5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Segitiga {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    double alas;
    double tinggi;
    double luas;
    double keliling;
    double sisiMiring;
    Logger logger = Logger.getLogger(Segitiga.class.getName());

    try {
      logger.info("Masukkan alas segitiga: ");
      alas = sc.nextDouble();
      logger.info("Masukkan tinggi segitiga: ");
      tinggi = sc.nextDouble();
      luas = (alas * tinggi) / 2;
      sisiMiring = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggi, 2));
      keliling = alas + (2 * sisiMiring);
      logger.log(Level.INFO, "Luas segitiga: {0}", luas);
      logger.log(Level.INFO, "Keliling segitiga: {0}", keliling);
    } catch (NumberFormatException e) {
      logger.info("Inputan harus berupa angka");
    }
  }
}
