import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer user = new Customer();
        user.isiForm();

        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Kendaraan :");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Kendaraan mobil = new Mobil();
                mobil.daftar();
                break;
            case 2:
                Kendaraan motor = new Motor();
                motor.daftar();
                break;
        }

        Transaksi transaksi = new Transaksi();
        transaksi.transaksi();
        //simpen dulu disini ya...
//        System.out.print("Total biaya : "+   transaksi.hitungBiaya(harga,lama));
    }
}