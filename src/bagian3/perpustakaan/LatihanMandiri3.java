/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author ASUS
 */
public class LatihanMandiri3 {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Buku b2 = new Buku("Sang Pemimpi", "Andrea Hirata", 2006);
        Buku b3 = new Buku("Bumi", "Tere Liye", 2014);

        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        // Menampilkan semua buku
        perpus.tampilkanSemuaBuku();

        // Meminjam buku
        perpus.pinjamBuku("Bumi");

        // Mengembalikan buku (Soal 1)
        perpus.kembalikanBuku("Bumi");

        // Mencari buku berdasarkan penulis (Soal 3)
        perpus.cariPenulis("Andrea Hirata");
    }
}
