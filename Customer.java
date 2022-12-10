import java.util.Scanner;

public class Customer {
    private String nik;
    private String namaCustomer;
    private String noHp;
    private String alamat;

    public char[] getNik() {
        return nik;
    }

    public void setNik(char[] nik) {
        this.nik = nik;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void isiForm(){
        Scanner in = new Scanner(System.in);
        System.out.println("FORM DATA DIRI USER");
        System.out.print("Masukan Nama Anda : ");
        String nama = in.nextLine();
        System.out.print("Masukan NIK anda : ");
        String nik = in.nextLine();
        System.out.print("Masukan Nomer Hp Anda : ");
        String noHp = in.nextLine();
        System.out.print("Masukan Alamat Anda : ");
        String alamat = in.nextLine();
    }

    public void bayar(){

    }
}
