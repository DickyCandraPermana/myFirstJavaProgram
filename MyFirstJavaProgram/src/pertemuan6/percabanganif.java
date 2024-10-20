package pertemuan6;

import java.util.Scanner;

public class percabanganif {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nilai;
            boolean kelulusan = false;
            String nama;

            System.out.print("Masukkan nama mahasiswa: ");
            nama = sc.nextLine();
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = sc.nextInt();

            if (nilai <= 0) {
                System.out.println("Mahasiswa tidak mengikuti kuliah.");
            } else if (nilai <= 50) {
                System.out.println("Mahasiswa mendapatkan nilai F");
            } else if (nilai <= 60) {
                System.out.println("Mahasiswa mendapatkan nilai D");
            } else if (nilai <= 70) {
                System.out.println("Mahasiswa mendapatkan nilai C");
            } else if (nilai <= 80) {
                System.out.println("Mahasiswa mendapatkan nilai B");
            } else if (nilai <= 100) {
                System.out.println("Mahasiswa mendapatkan nilai A");
            } else {
                System.out.println("Mahasiswa mendapatkan nilai A+");
            }

            char konversi;

            // if (nilai > 80) {
            // konversi = 'A';
            // } else {
            // if (nilai > 70) {
            // konversi = 'B';
            // } else {
            // if (nilai > 60) {
            // konversi = 'C';
            // } else {
            // konversi = 'D';
            // }
            // }
            // }

            if (nilai < 60) {
                konversi = 'D';
            } else {
                if (nilai < 70) {
                    konversi = 'C';
                } else {
                    if (nilai < 80) {
                        konversi = 'B';
                    } else {
                        konversi = 'A';
                    }
                }
            }

            boolean valid;

            valid = !(nilai < 0 || nilai > 100);

            if (nilai >= 60) {
                kelulusan = !kelulusan;
            }

            if (kelulusan) {
                System.out.println("Mahasiswa " + nama + " lulus. Dengan nilai " + konversi);
            } else {
                System.out.println("Mahasiswa " + nama + " tidak lulus. Dengan nilai " + konversi);
            }
        }
    }
}
