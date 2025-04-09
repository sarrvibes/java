package produk;

public class Produk{
    String nama;
    double harga;
    int stok;

    public Produk(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void displayInfo() {
        System.out.println("== Info Produk ==");
        System.out.printf("%-10s: %s\n", "Nama", nama);
        System.out.printf("%-10s: %.2f\n", "Harga", harga);
        System.out.printf("%-10s: %d\n", "Stok", stok);
    }
}