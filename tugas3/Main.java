import produk.*;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // meminta inputan makanan
        System.out.println("== input info MAKANAN ==");
        System.out.print("masukkan nama makanan: ");
        String namaMakanan = input.nextLine();
        System.out.print("masukkan harga: ");
        double hargaMakanan = input.nextDouble();
        System.out.print("masukkan jumlah stok: ");
        int stokMakanan = input.nextInt();
        input.nextLine();
        System.out.print("masukkan tanggal kadaluarsa (YYYY-MM-DD): ");
        String tglExp = input.nextLine();
        System.out.println();

        Makanan mkn1 = new Makanan(namaMakanan, hargaMakanan, stokMakanan, tglExp);

        // meminta inputan barang elektronik
        System.out.println("== input info Elektronik ==");
        System.out.print("masukkan nama elektronik: ");
        String namaElek = input.nextLine();
        System.out.print("masukkan harga: ");
        double hargaElek = input.nextDouble();
        System.out.print("masukkan jumlah stok: ");
        int stokElek = input.nextInt();
        input.nextLine();
        System.out.print("masukkan jumlah garansi(bulan): ");
        int garansi = input.nextInt();

        Elektronik elek1 = new Elektronik(namaElek, hargaElek, stokElek, garansi);

        System.out.println("Informasi Produk yang berhasil ditambahkan");
        mkn1.displayInfo();
        System.out.println();
        elek1.displayInfo();

        input.close(); 

    }

}
