package latihan3susulan;

/**
 * Nama : [Isikan Nama Anda]
 * NPM  : [Isikan NPM Anda]
 * Kelas: [Isikan Kelas Anda]
 */
public class BangunDatar {
    // Atribut bertipe desimal
    public double alas;
    public double tinggi;
    public double jariJari;
    public double hasil;

    public BangunDatar() {
        alas = 0.0;
        tinggi = 0.0;
        jariJari = 0.0;
        hasil = 0.0;
    }

    public void hitungLuasSegitiga() {
        hasil = 0.5 * alas * tinggi;
    }

    // Method untuk menghitung luas lingkaran
    public void hitungLuasLingkaran() {
        hasil = 3.14 * jariJari * jariJari;
    }

    public double gethasil() {
        return hasil;
    }
    public void info() {
        System.out.println("Hasil perhitungan: " + hasil);
    }

    public void info() {
        System.out.println("Class BangunDatar dengan atribut: alas, tinggi, jariJari, hasil");
    }
}