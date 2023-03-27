package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Persegi extends Lkbangun2D {
    private double sisi;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=getLuas()*4;
        setKeliling(kl);
    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=getSisi()*getSisi();
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        double z = masuk.nextDouble();
        setSisi(z);
        hitungkeliling();
        hitungluas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
}
