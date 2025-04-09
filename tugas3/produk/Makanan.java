package produk;

public class Makanan extends Produk{
    private String tglExp;

    public Makanan(String nama, double harga, int stok, String tglExp){
        super(nama, harga, stok);
        this.tglExp = tglExp;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("%-10s: %s\n", "Tanggal Kadaluarsa", tglExp);
    }
    
}
