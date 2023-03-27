package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Lingkaran extends Lkbangun2D {
    private double jarijari;
    final double phi=3.14;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=2*phi*getJarijari();
        setKeliling(kl);
    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=phi*getJarijari()*getJarijari();
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan jari jari : ");
        double z = masuk.nextDouble();
        setJarijari(z);
        hitungkeliling();
        hitungluas();
        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }
}
