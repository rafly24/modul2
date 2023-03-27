package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Belahketupat extends Lkbangun2D {
    public double sisi;
    public double d1;
    public double d2;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=getSisi()*4;
        setKeliling(kl);

    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=((getD1())*(getD2()));
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan sisi belah ketupat : ");
        double z = masuk.nextDouble();
        setSisi(z);
        System.out.print("Masukkan diameter 1 : ");
        double x = masuk.nextDouble();
        setD1(x);
        System.out.println("Masukkan diameter2:");
        double y=masuk.nextDouble();
        setD2(y);

        hitungkeliling();
        hitungluas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public double getSisi() {
        return sisi;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }
}
