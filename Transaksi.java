import java.util.Scanner;

public class Transaksi {
    protected String tanggalPinjam;
    protected String tanggalKembali;
    public int lama;
    protected int idTransaksi;
    protected double totalBiaya;

    public int hitungBiaya(int harga,int lama){
        totalBiaya=lama*harga;
        return (int) totalBiaya;
    }

    public void transaksi(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan ID Transaksi : ");
        int idTransaksi = input.nextInt();
        System.out.print("Masukan lama sewa : ");
        int lama = input.nextInt();
//        this.lama=lama;
        System.out.println("Masukan tanggal pinjam : ");
        String tanggalPinjam = input.nextLine();
        System.out.print("Masukan tanggal kembali : ");
        String tanggalKembali = input.nextLine();


    }

}
