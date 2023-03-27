package Modul2;
import Modul2.bangun2d.*;
import Modul2.bangun3d.Balok;
import Modul2.bangun3d.Bola;
import Modul2.bangun3d.Kubus;
import Modul2.bangun3d.Tabung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Masukkan bangun ruang mana yang mau kalian buat\n1. Bangun datar\n2. Bangun ruang");
        System.out.println("pilih menu:");
        int pilih = inp.nextInt();
        switch (pilih) {
            case 1:
                hitung2D();
                break;

            case 2:
                hitung3D();
                break;

            default:
                System.out.println("pilihan tidak ada");
                break;


        }
    }


    private static void hitung2D() {

        System.out.println("aplikasi penghitung luas dan keliling bangun datar");
        System.out.println("1.persegi");
        System.out.println("2.persegi panjang");
        System.out.println("3.segitiga");
        System.out.println("4.lingkaran");
        System.out.println("5.jajargenjang");
        System.out.println("6.belah ketupat");
        System.out.println("7.bangun tidak ada");
        String input;
        Scanner inputan =new Scanner(System.in);
        int shape2d;
        System.out.println("pilih bangunan:");
        shape2d=inputan.nextInt();
           switch (shape2d) {
               case 1:
                   Persegi psg = new Persegi();
                   psg.infobangun();
                   break;
               case 2:
                   Persegipanjang psgpg = new Persegipanjang();
                   psgpg.infobangun();
                   break;
               case 3:
                   Segitiga sg = new Segitiga();
                   sg.infobangun();
                   break;
               case 4:
                   Lingkaran lk = new Lingkaran();
                   lk.infobangun();
                   break;
               case 5:
                   Jajargenjang jg = new Jajargenjang();
                   jg.infobangun();
                   break;
               case 6:
                   Belahketupat bk = new Belahketupat();
                   bk.infobangun();
                   break;
               default:
                   System.out.println("bangunan tidak ada");
                   break;






        }
        //Persegipanjang psgpg = new Persegipanjang();
        //psgpg.infobangun();
        //Persegi psg =new Persegi();
        //psg.infobangun();
        //Belahketupat bk= new Belahketupat();
        //bk.infobangun();
    }

    private static void hitung3D(){
        System.out.println("aplikasi penghitung Volume bangun ruang:");
        System.out.println("1.Kubus");
        System.out.println("2.Balok");
        System.out.println("3.Tabung");
        System.out.println("4.Bola");
        System.out.println("5.Kerucut");
        System.out.println("6.bangun tidak ada");
        String input;
        Scanner inputan =new Scanner(System.in);
        int shape3d;
        System.out.println("pilih bangunan:");
        shape3d=inputan.nextInt();
        switch (shape3d){
            case 1:
                Kubus kbs =new Kubus();
                kbs.infobangun();
                break;
            case 2:
                Balok blk = new Balok();
                blk.infobangun();
                break;
            case 3:
                Tabung tb=new Tabung();
                tb.infobangun();
                break;
            case 4:
                Bola bl=new Bola();
                bl.infobangun();
                break;
            default:
                System.out.println("bangunan tidak ada");
                break;




        }



        //Kubus kbs = new Kubus();

        //kbs.infobangun();
    }
    }