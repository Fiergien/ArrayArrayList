/*
Nama : Muhammad Isra Maulana
NPM  : 2410010458
Kelas: Ti 4a NONREG BANJARMASIN
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author ASUS
 */

public class MainTugas {

    public static void main(String[] args) {

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek kelas
        KelasKuliah kelas = new KelasKuliah();

        // Menambahkan 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "241001", 75));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "241002", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "241003", 80));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "241004", 65));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "241005", 50));

        // Menampilkan semua data
        kelas.tampilkanSemua();

        // Menampilkan rata-rata dan jumlah lulus
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Menambahkan mahasiswa baru
        kelas.tambahMahasiswa(
                new Mahasiswa("Farhan", "241006", 90)
        );

        System.out.println("\nSetelah menambah mahasiswa baru:");
        System.out.println("Jumlah data mahasiswa = "
                + kelas.jumlahMahasiswa());

        // Tampilkan kembali data
        kelas.tampilkanSemua();
    }
}
