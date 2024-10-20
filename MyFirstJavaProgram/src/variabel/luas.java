package variabel;

import javax.swing.JOptionPane;

public class luas {
  public static void main(String[] args) {

    BangunDatar bangunDatar = new BangunDatar();
    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();

    bangunDatar.setPanjang(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Panjang: ")));
    bangunDatar.setLebar(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Lebar: ")));
    JOptionPane.showMessageDialog(null, "Luas bangun datar: " + bangunDatar.hitungLuas());
    JOptionPane.showMessageDialog(null, "Keliling bangun datar: " + bangunDatar.hitungKeliling());

    persegi.setSisi(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Sisi: ")));
    JOptionPane.showMessageDialog(null, "Luas persegi: " + persegi.hitungLuas());
    JOptionPane.showMessageDialog(null, "Keliling persegi: " + persegi.hitungKeliling());

    segitiga.setAlas(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Alas: ")));
    segitiga.setTinggi(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Panjang: ")));
    segitiga.setSisiSegitiga(10, 10, 10);
    JOptionPane.showMessageDialog(null, "Luas segitiga: " + segitiga.hitungLuas());
    JOptionPane.showMessageDialog(null, "Keliling segitiga: " + segitiga.hitungKeliling());

    lingkaran.setJari(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Jari-jari: ")));
    JOptionPane.showMessageDialog(null, "Luas lingkaran: " + lingkaran.hitungLuas());
    JOptionPane.showMessageDialog(null, "Keliling lingkaran: " + lingkaran.hitungKeliling());
  }
}

class BangunDatar {
  private double panjang;
  private double lebar;

  public double hitungLuas() {
    return panjang * lebar;
  }

  public double hitungKeliling() {
    return 2 * (panjang + lebar);
  }

  public double getPanjang() {
    return panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

}

class Persegi extends BangunDatar {
  private double sisi;

  @Override
  public double hitungLuas() {
    return sisi * sisi;
  }

  @Override
  public double hitungKeliling() {
    return 4 * sisi;
  }

  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }
}

class Segitiga extends BangunDatar {
  private double alas;
  private double tinggi;

  private double sisiA;
  private double sisiB;
  private double sisiC;

  @Override
  public double hitungLuas() {
    return alas * tinggi / 2;
  }

  @Override
  public double hitungKeliling() {
    return sisiA + sisiB + sisiC;
  }

  public double getAlas() {
    return alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  public void setSisiSegitiga(double sisiA, double sisiB, double sisiC) {
    this.sisiA = sisiA;
    this.sisiB = sisiB;
    this.sisiC = sisiC;
  }
}

class Lingkaran extends BangunDatar {
  private double jari;

  @Override
  public double hitungLuas() {
    return (double) (3.14 * jari * jari);
  }

  @Override
  public double hitungKeliling() {
    return (double) (2 * 3.14 * jari);
  }

  public double getJari() {
    return jari;
  }

  public void setJari(double jari) {
    this.jari = jari;
  }
}