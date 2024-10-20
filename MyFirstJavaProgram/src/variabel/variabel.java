package variabel;

public class variabel {
  public static void main(String[] args) {
    String nama;
    nama = "Lucifer Morningstar";
    int umur, tahunLahir;
    tahunLahir = 0;
    umur = 2024 - tahunLahir;
    double ipk = 4.0;
    char kelas = 'A';
    boolean mhsaktif = true;
    System.out.println("Nama saya " + nama);
    System.out.println("Tahun lahir " + tahunLahir);
    System.out.println("Umur saya " + umur + " tahun");
    System.out.println("IPK :" + ipk);
    System.out.println("Kelas :" + kelas);
    System.out.println("Status keaktifan :" + mhsaktif);
    System.out.println("Dua tahun lagi umur saya: " + (umur + 2) + " Tahun");
    int tigaThnLalu;
    tigaThnLalu = umur - 3;
    System.out.println("Tiga tahun lalu umur saya " + tigaThnLalu + " Tahun");
  }
}
