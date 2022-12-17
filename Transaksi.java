import java.util.Scanner;

public class Transaksi implements Rental{
    private String nik;
    private String namaCustomer;
    private String noHp;
    private String alamat;
    public int uang;

    public int lama;
    private int idTransaksi;
    protected double totalBiaya;

    @Override
    public void Form(){
        Scanner in = new Scanner(System.in);
        System.out.println("FORM DATA DIRI USER");
        System.out.print("Masukan Nama Anda : ");
        namaCustomer = in.nextLine();
        System.out.print("Masukan NIK anda : ");
        nik = in.nextLine();
        System.out.print("Masukan Nomer Hp Anda : ");
        noHp = in.nextLine();
        System.out.print("Masukan Alamat Anda : ");
        alamat = in.nextLine();
    }

    @Override
    public void pilih() {
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
    }

    @Override
    public void transaksi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ID Transaksi : ");
        int idTransaksi = input.nextInt();
        System.out.print("Masukan lama sewa : ");
        int lama = input.nextInt();
        this.lama = lama;

    }

    @Override
    public void bayar(){
        System.out.print("Total Biaya : ");
        int harga=Kendaraan.harga;
        System.out.println(hitungBiaya(harga,lama));
        System.out.print("Masukan uang anda dalam rupiah : ");
        Scanner in = new Scanner(System.in);
        int uang = in.nextInt();
        System.out.println("Uang Kembali " + (uang - hitungBiaya(harga,lama)));
    }

    public int hitungBiaya(int harga,int lama){
        totalBiaya=lama*harga;
        return (int) totalBiaya;
    }
}
