import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Mobil extends Kendaraan{
    private int harga;
    private String warna;

    @Override
    public void daftar() {
        System.out.println("======================");
        System.out.println("Daftar Mobil ");
        System.out.println("======================");
        System.out.println("1.Avanza");
        System.out.println("2.Senia");
        System.out.println("3.Jazz");
        System.out.println("4.yaris");
        System.out.println("5.agya");
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
                break;
            case 2 :
                System.out.println("Anda Memilih Senia");
                jenis = "Senia";
                break;
    }
}
}
