/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Windows
 */
class Hewan extends MakhlukHidup implements Bergerak {
    private String jenis;
    public Hewan(String nama, int umur, String jenis) {
        super(nama, umur);
        this.jenis = jenis;
    }

    public void bernapas() {
        System.out.println(nama + " bernapas dengan paru-paru");
    }

    public void makan() {
        System.out.println(nama + " Makan sesuai dengan jenisnya");
    }

    public void berjalan() {
        System.out.println(nama + " berjalan dengan empat kaki");
    }

    public void berlari() {
        System.out.println(nama + " berlari dengan kencang");
    }

    public void melompat() {
        System.out.println(nama + " Melompat sambil menerkam");
    }
    public void infoHewan() {
        infoMakhluk();
        System.out.println("Jenis: " + jenis);
    }
}

