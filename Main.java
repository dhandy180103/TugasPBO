import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rental sewa = new Transaksi();
        Customer user = new Customer(sewa);

        Scanner input = new Scanner(System.in);
        String aksi;

        while(true){
            System.out.println("\n==========================");
            System.out.println("   SEWA KENDARAAN YOGYA   ");
            System.out.println("==========================");
            System.out.println("[1] Mengisi Form ");
            System.out.println("[2] Memilih Kendaraan ");
            System.out.println("[3] Melakukan Transaksi ");
            System.out.println("[4] Melakukan Pembayaran ");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                user.isiForm();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("2")){
                user.memilih();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("3")){
                user.melakukanTransaksi();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("4")){
                user.pembayaran();
                input.nextLine();
            } else if (aksi.equalsIgnoreCase("0")){
                System.out.println("Selamat Anda Telah menyelesaikan Transaksi");
                System.out.println("Terimakasih <3");
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
                input.nextLine();
            }
        }
    }
}
