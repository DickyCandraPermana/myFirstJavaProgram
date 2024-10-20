//package pertemuan5;

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