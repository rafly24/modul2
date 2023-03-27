package Modul2.bangun3d;

import Modul2.Lkbanngun3d;

import java.util.Scanner;

public class Bola extends Lkbanngun3d {
    private double jarijari;
    final double phi=3.14;
    final double rumus=0.75;

    @Override
    public void hitungvolume() {
        super.hitungvolume();
        double vl=rumus*phi*getJarijari()*getJarijari()*getJarijari();
        setVolume(vl);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan jari jari:");
        double rusuk = input.nextDouble();
        setJarijari(rusuk);
        hitungvolume();
        System.out.println("volumenya adalah"+getvolume());
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
