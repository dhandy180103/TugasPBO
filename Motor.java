import java.util.Scanner;

public class Motor extends Kendaraan{
    private int harga;
    private String warna;

    @Override
    public void daftar() {
//        Scanner input = new Scanner(System.in);
        System.out.println("======================");
        System.out.println("Pilih Jenis Motor");
        System.out.println("======================");
        System.out.println("1.Honda Vario");
        System.out.println("2.Honda Beat");
        System.out.println("3.Yamaha Aerox 155CC");
        System.out.println("4.Yamaha N-MAXX New");
        System.out.println("5.Vespa Matic");
        System.out.print("Masukkan pilihan : ");
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
                System.out.println("Anda Memilih Honda Vario");
                jenis = "Honda Vario";
                Kendaraan.harga = 150000;
                break;
            case 2 :
                System.out.println("Anda Memilih Honda Beat");
                jenis = "Honda Beat";
                Kendaraan.harga = 130000;
                break;
            case 3 :
                System.out.println("Anda Memilih Aerox 155CC");
                jenis = "Aerox 155CC";
                Kendaraan.harga = 140000;
                break;
            case 4 :
                System.out.println("Anda Memilih N-MAX New");
                jenis = "N-Maxx New";
                Kendaraan.harga = 170000;
                break;
            case 5 :
                System.out.println("Anda Memilih Vespa Matic");
                jenis = "Vespa Matic";
                Kendaraan.harga = 200000;
                break;
        }
    }
}
