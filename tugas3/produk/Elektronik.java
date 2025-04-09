package produk;

public class Elektronik extends Produk {
    private int garansi;

    public Elektronik(String nama, double harga, int stok, int garansi){
        super(nama, harga, stok);
        this.garansi = garansi;
    }
    
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("%-10s: %d bulan\n", "Garansi Barang", garansi);
    }
}
