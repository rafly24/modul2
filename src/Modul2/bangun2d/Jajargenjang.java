package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Jajargenjang extends Lkbangun2D {
    private double alas;
    private double tinggi;
    private double miring;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=2*getAlas()*getMiring();
    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=getAlas()*getTinggi();
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan sisi alas : ");
        double z = masuk.nextDouble();
        setAlas(z);
        System.out.print("Masukkan sisi miring : ");
        double x = masuk.nextDouble();
        setMiring(x);
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

    public void setMiring(double miring) {
        this.miring = miring;
    }

    public double getMiring() {
        return miring;
    }
}
