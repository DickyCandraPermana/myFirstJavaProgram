package lol;

import javax.swing.JOptionPane;

public class coba {

    public static void main(String[] args) {
        try {
            int count = Integer.parseInt(JOptionPane.showInputDialog("Mau faktorial dari berapa?"));
            JOptionPane.showMessageDialog(null, "Akan menunjukkan faktorial dari: " + count);
            System.out.println(tryRecursive(count));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inputan Harus Berupa Angka!");
        }
        // try {
        //     int i = (int) Math.floor(Math.random() * 10) + 1;
        //     JOptionPane.showMessageDialog(null, "Mengulang sebanyak: " + i + " kali");
        //     //Integer.parseInt(JOptionPane.showInputDialog(null, "Nulis Hello World Berapa Kali?"));
        //     while (0 < i) {
        //         lol(i);
        //         i--;
        //     }

        // } catch (NumberFormatException e) {
        //     JOptionPane.showMessageDialog(null, "Inputan Harus Berupa Angka!");
        // }
        // String nama = JOptionPane.showInputDialog("Are You Here?");
        // if (nama != null) {
        //     JOptionPane.showMessageDialog(null, "Hello " +nama);
        // } else {
        //     JOptionPane.showMessageDialog(null, "You don't input your name yet...");
        // }
    }

    public static int tryRecursive(int count) {
        System.out.println(count);
        if (count <= 0) {
            return 1;
        } else {
            return count * tryRecursive(count - 1);
        }
    }

    public static void lol(int count) {
        System.out.println(("Hello World! " + count));
    }
}
