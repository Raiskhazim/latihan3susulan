package latihan3susulan;

public class BangunDatarBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class BangunDatar
        BangunDatar azim = new BangunDatar();

        // Mengisi nilai alas dan tinggi, lalu menghitung luas segitiga
        azim.alas = 6.0;
        azim.tinggi = 4.0;
        azim.hitungLuasSegitiga();
        System.out.println("Luas Segitiga: " + azim.getHasil());

        // Mengisi nilai jariJari, lalu menghitung luas lingkaran
        azim.jariJari = 7.0;
        azim.hitungLuasLingkaran();
        System.out.println("Luas Lingkaran: " + azim.getHasil());
    }
}