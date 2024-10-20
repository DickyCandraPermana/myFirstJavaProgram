package variabel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class scanner {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int umur;
        double tinggi;
        String nama;
        char jk;
        boolean aktif;

        try {
            System.out.print("Masukan umur anda: ");
            umur = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan nama anda: ");
            nama = sc.nextLine();
            System.out.print("Masukan tinggi anda: ");
            tinggi = sc.nextDouble();
            sc.nextLine();
            System.out.print("Masukan jenis kelamin anda: ");
            jk = sc.nextLine().charAt(0);
            System.out.print("Aktif (ya/tidak): ");
            String temp = sc.nextLine();
            aktif = ("ya".equals(temp)) || ("YA".equals(temp)) || ("y".equals(temp)) || ("Y".equals(temp));
            System.out.println(nama + " mempunyai umur " + umur + " tahun, tinggi " + tinggi + " cm");
            System.out.println("Jenis kelamin: " + jk + ", aktif: " + aktif);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Inputan harus berupa angka");
        }
    }
}
