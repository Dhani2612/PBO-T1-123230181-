/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Windows
 */
class Tumbuhan extends MakhlukHidup {
    private String jenisDaun;

    public Tumbuhan(String nama, int umur, String jenisDaun) {
        super(nama, umur);
        this.jenisDaun = jenisDaun;
    }
    public void bernapas() {
        System.out.println(nama + " bernapas melalui Daun");
    }

    public void makan() {
        System.out.println(nama + " Melakukan fotosintesis");
    }
    public void infoTumbuhan() {
        infoMakhluk();
        System.out.println("Jenis Daun: " + jenisDaun);
    }
}

