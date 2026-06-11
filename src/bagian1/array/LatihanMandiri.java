/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author ASUS
 */
public class LatihanMandiri {

    public static void main(String[] args) {

        // 1. Array suhu harian (double)
        double[] suhu = {29.5, 31.2, 27.8, 33.1, 30.0, 28.4};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }

            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("=== SOAL 1 ===");
        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);

        // 2. Array String berisi nama hari
        String[] hari = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jumat"
        };

        System.out.println("\n=== SOAL 2 ===");
        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // 3. Menghitung jumlah angka genap
        int[] angka = {4, 8, 15, 16, 23, 42};

        int jumlahGenap = 0;

        for (int nilai : angka) {
            if (nilai % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\n=== SOAL 3 ===");
        System.out.println("Jumlah angka genap = " + jumlahGenap);
    }
}
