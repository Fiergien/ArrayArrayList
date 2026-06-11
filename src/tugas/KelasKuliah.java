/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */


import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        daftarMahasiswa = new ArrayList<>();
    }

    // Menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Menghitung rata-rata nilai
    public double hitungRataRata() {

        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah mahasiswa lulus
    public int jumlahLulus() {

        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    // Menampilkan semua data mahasiswa
    public void tampilkanSemua() {

        System.out.println("=== DATA MAHASISWA ===");

        for (Mahasiswa m : daftarMahasiswa) {

            System.out.println("Nama  : " + m.getNama());
            System.out.println("NPM   : " + m.getNpm());
            System.out.println("Nilai : " + m.getNilai());
            System.out.println("Lulus : " + (m.lulus() ? "Ya" : "Tidak"));
            System.out.println("----------------------");
        }
    }

    // Mengembalikan jumlah data mahasiswa
    public int jumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}