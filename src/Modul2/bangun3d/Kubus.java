package Modul2.bangun3d;

import Modul2.Lkbanngun3d;

import java.util.Scanner;

public class Kubus extends Lkbanngun3d {
    public double rusuk;
    @Override
    public void hitungvolume() {
        super.hitungvolume();
        double a=getRusuk()*getRusuk()*getRusuk();
        setVolume(a);



    }
    @Override
    public void infobangun(){
        super.infobangun();
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan rusuk dari kubus");
        double rusuk = input.nextDouble();
        setRusuk(rusuk);
        hitungvolume();
        System.out.println("volumenya adalah"+getvolume());
    }

    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
}
