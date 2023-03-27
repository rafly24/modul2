package Modul2.bangun3d;

import Modul2.Lkbanngun3d;

import java.util.Scanner;

public class Kerucut extends Lkbanngun3d {
    private double jarijari;
    private double tinggi;
    final double phi=3.14;
    final double rumus=0.33;

    @Override
    public void hitungvolume() {
        super.hitungvolume();
        double vl=rumus*phi*getJarijari()*getTinggi();
        setVolume(vl);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan jari jari");
        double jarijari = input.nextDouble();
        setJarijari(jarijari);
        System.out.println("masukkan tinggi");
        double tinggi= input.nextDouble();
        setTinggi(tinggi);
        hitungvolume();
        System.out.println("volumenya adalah"+getvolume());
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
}
