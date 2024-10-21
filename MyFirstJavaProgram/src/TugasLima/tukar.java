package TugasLima;

/*
 ! Psudocode program !
 * 1. Program start
 * 2. Deklarasi variabel(a, b, c)
 * 3. Memberi nilai pada variabel a dan b;
 * 4. Cek awal data
 * 5. Proses data
 * 6. Memasukan nilai variabel a ke variabel c;
 * 7. Memasukan nilai variabel b ke variabel a;
 * 8. Memasukan nilai variabel c ke variabel b;
 * 9. Output data yang telah ditukar
 * 10. Program end
 */

public class tukar {
  public static void main(String[] args) {

    // Deklarasi variabel
    int a = 10;
    int b = 20;
    int c;

    // Cek awal data
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);

    // Proses data
    c = a;
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
    System.out.println("Nilai c: " + c);
    a = b;
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
    System.out.println("Nilai c: " + c);
    b = c;
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
    System.out.println("Nilai c: " + c);

    // Output data
    System.out.println("Nilai a: " + a);
    System.out.println("Nilai b: " + b);
  }
}