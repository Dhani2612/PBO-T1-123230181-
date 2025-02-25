/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Windows
 */
class Manusia extends MakhlukHidup implements Bergerak {
    private String pekerjaan;

    public Manusia(String nama, int umur, String pekerjaan) {
        super(nama, umur);
        this.pekerjaan = pekerjaan;
    }

    public void bernapas() {
        System.out.println(nama + " Bernapas dengan paru-paru");
    }
    public void makan() {
        System.out.println(nama + " makan dengan tangan dan makai alat makan");
    }
    public void berjalan() {
        System.out.println(nama + " berjalan dengan dua kaki");
    }
    public void berlari() {
        System.out.println(nama + " berlari cepat");
    }
    public void melompat() {
        System.out.println(nama + " melompat tinggi");
    }
    public void infoManusia() {
        infoMakhluk();
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}

