package Modul2.bangun2d;

import Modul2.Lkbangun2D;

import java.util.Scanner;

public class Persegipanjang extends Lkbangun2D {
    private double panjang;
    private double lebar;

    @Override
    public void hitungkeliling() {
        super.hitungkeliling();
        double kl=((getLebar()*2)+(getPanjang()*2));
        setKeliling(kl);
    }

    @Override
    public void hitungluas() {
        super.hitungluas();
        double ls=getPanjang()*getLebar();
        setLuas(ls);
    }

    @Override
    public void infobangun() {
        super.infobangun();
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan lebar persegi panjang : ");
        double z = masuk.nextDouble();
        setLebar(z);
        System.out.print("Masukkan panjang persegi panjang : ");
        double x = masuk.nextDouble();
        setPanjang(x);

        hitungkeliling();
        hitungluas();

        System.out.println("Keliling adalah : "+ getKeliling());
        System.out.println("Luas adalah : "+ getLuas());
    }

    public double getLebar() {
        return lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
}
