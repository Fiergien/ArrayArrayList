/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class LatihanMandiri2 {

    public static void main(String[] args) {

        
        System.out.println("=== SOAL 1 ===");

        ArrayList<String> daftarBelanja = new ArrayList<>();

        // Menambah 4 item
        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        // Menghapus item ke-2 (indeks 1)
        daftarBelanja.remove(1);

        System.out.println("Isi daftar belanja:");
        for (String item : daftarBelanja) {
            System.out.println("- " + item);
        }

        System.out.println("Jumlah item akhir: " + daftarBelanja.size());


        
        System.out.println("\n=== SOAL 2 ===");

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(12);
        angka.add(45);
        angka.add(7);
        angka.add(89);
        angka.add(34);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("Nilai terbesar = " + terbesar);


        
        System.out.println("\n=== SOAL 3 ===");

        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Rina");
        nama.add("Ahmad");
        nama.add("Doni");

        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
