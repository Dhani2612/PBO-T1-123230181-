/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author Windows
 */
abstract class MakhlukHidup {
    protected String nama;
    protected int umur;
    public MakhlukHidup(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void infoMakhluk() {
        System.out.println("Nama: "+ nama + ", Umur: " + umur +" tahun.");
    }
    
    public abstract void bernapas();
    public abstract void makan();
}

