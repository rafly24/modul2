package Modul2.bangun3d;

import Modul2.Lkbanngun3d;

import java.util.Scanner;

public class Balok extends Lkbanngun3d {
    private double panjang;
    private double lebar;
    private double tinggi;

    @Override
    public void hitungvolume() {
        super.hitungvolume();
        double vl=getPanjang()*getLebar()*getTinggi();
        setVolume(vl);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan panjang:");
        double panjang = input.nextDouble();
        setPanjang(panjang);
        System.out.println("masukkan lebar:");
        double lebar= input.nextDouble();
        setLebar(lebar);
        System.out.println("masukkan tinggi");
        double tinggi= input.nextDouble();
        setTinggi(tinggi);
        hitungvolume();
        System.out.println("volumenya adalah"+getvolume());
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }
}
