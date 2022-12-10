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
        System.out.println("1.Honda vario");
        System.out.println("2.Honda beat");
        System.out.println("3.Yamaha Nmax");
        System.out.println("4.Yamaha Mio");
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
                break;
            case 2 :
                System.out.println("Anda Memilih Honda Beat");
                jenis = "Honda Beat";
                break;
        }
    }
}
