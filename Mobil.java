import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Mobil extends Kendaraan{
    protected int harga;
    public String warna;
    public String jenis;

    @Override
    public void daftar() {
        System.out.println("======================");
        System.out.println("Daftar Mobil ");
        System.out.println("======================");
        System.out.println("1.Avanza");
        System.out.println("2.Innova");
        System.out.println("3.Fortuner");
        System.out.println("4.Alphard");
        pilihKendaraan();
    }

    @Override
    void pilihKendaraan() {
        System.out.println("Pilih Kendaraan");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1 :
                System.out.println("Anda Memilih Avanza");
                jenis = "Avanza";
                Kendaraan.harga = 475000;
                break;
            case 2 :
                System.out.println("Anda Memilih Innova");
                jenis = "Innova";
                Kendaraan.harga = 700000;
                break;
            case 3 :
                System.out.println("Anda Memilih Fortuner");
                jenis = "Fortuner";
                Kendaraan.harga = 1800000;
                break;
            case 4 :
                System.out.println("Anda Memilih Alphard");
                jenis = "Alphard";
                Kendaraan.harga = 3500000;
                break;
        }
    }
}
