package Modul2.bangun3d;

import Modul2.Lkbanngun3d;

import java.util.Scanner;

public class Tabung extends Lkbanngun3d {
    private double jarijari;
    private double tinggi;
    final double phi=3.14;

    @Override
    public void hitungvolume() {
        super.hitungvolume();
        double vl=phi*getJarijari()*getJarijari()*getTinggi();
        setVolume(vl);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan tinggi dari kubus");
        double tinggi = input.nextDouble();
        setTinggi(tinggi);
        System.out.println("masukkan jari jari:");
        double jarijari= input.nextDouble();
        setJarijari(jarijari);
        hitungvolume();
        System.out.println("volumenya adalah"+getvolume());
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
