/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.object_class;

/**
 *
 * @author My MSI
 */

// Class utama (tempat program dijalankan)
public class Object_Class {

    public static void main(String[] args) {

        // Membuat objek segitiga dengan nilai alas, tinggi, sisi
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        System.out.println("Segitiga 1");
        System.out.println("Luas: " + segitiga1.getLuas());       // memanggil method luas
        System.out.println("Keliling: " + segitiga1.getKeliling()); // memanggil method keliling

        // Objek kedua
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nSegitiga 2");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());

        // Objek ketiga
        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nSegitiga 3");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}

// Class Segitiga (class untuk membuat objek segitiga)
class Segitiga {

    // Atribut / variabel
    double alas;
    double tinggi;
    double sisi;

    // Konstruktor (dipanggil saat objek dibuat)
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    // Method untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double getKeliling() {
        return alas + tinggi + sisi;
    }

    // Method setter untuk mengubah nilai alas
    public void setAlas(double alasBaru) {
        alas = alasBaru;
    }

    // Method setter untuk mengubah nilai tinggi
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }

    // Method setter untuk mengubah nilai sisi
    public void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}