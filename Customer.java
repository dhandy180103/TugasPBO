
public class Customer {
    private Rental rental;

    public Customer(Rental rental){
        this.rental = rental;
    }

    void isiForm(){
        this.rental.Form();
    }

    void memilih(){
        this.rental.pilih();
    }
    void melakukanTransaksi(){
        this.rental.transaksi();
    }

    void pembayaran(){
        this.rental.bayar();
    }

}
