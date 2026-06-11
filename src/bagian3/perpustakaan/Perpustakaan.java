/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Perpustakaan {

    private ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(true);
                System.out.println(judul + " berhasil dipinjam.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Soal Nomor 1
    public void kembalikanBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                buku.setDipinjam(false);
                System.out.println(judul + " berhasil dikembalikan.");
                return;
            }
        }

        System.out.println("Buku tidak ditemukan.");
    }

    // Soal Nomor 3
    public void cariPenulis(String penulis) {

        boolean ditemukan = false;

        System.out.println("\nBuku karya " + penulis + ":");

        for (Buku buku : daftarBuku) {
            if (buku.getPenulis().equalsIgnoreCase(penulis)) {
                buku.info();
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada buku dari penulis tersebut.");
        }
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\nDaftar Buku Perpustakaan");

        for (Buku buku : daftarBuku) {
            buku.info();
        }
    }
}