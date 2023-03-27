package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Segitiga extends Lkbangun2D {
    private double alas;
    private double tinggi;
    private double sisi;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=getSisi()*3;
        setKeliling(kl);
    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=getAlas()*getTinggi()*0.5;
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan sisi belah segitiga: ");
        double z = masuk.nextDouble();
        setSisi(z);
        System.out.print("Masukkan diameter alas : ");
        double x = masuk.nextDouble();
        setAlas(x);
        System.out.println("Masukkan tinggi:");
        double y=masuk.nextDouble();
        setTinggi(y);

        hitungkeliling();
        hitungluas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
}
