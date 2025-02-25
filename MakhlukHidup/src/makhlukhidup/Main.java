/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Windows
 */
public class Main {
    public static void main(String[] args) {
        try {
            Manusia manusia = new Manusia("Dhani", 20,"Mahasiswa");
            manusia.infoManusia();
            manusia.bernapas();
            manusia.makan();
            manusia.berjalan();
            manusia.berlari();
            manusia.melompat();

            System.out.println("-----------------------------");

            Hewan hewan = new Hewan("Harimau", 5, "Karnivora");
            hewan.infoHewan();
            hewan.bernapas();
            hewan.makan();
            hewan.berjalan();
            hewan.berlari();
            hewan.melompat();

            System.out.println("-----------------------------");

            Tumbuhan tumbuhan = new Tumbuhan("Pohon Mangga", 10, "Lebar");
            tumbuhan.infoTumbuhan();
            tumbuhan.bernapas();
            tumbuhan.makan();
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " +e.getMessage());
        } finally {
            System.out.println("Program selesai");
        }
    }
}

