package Inheritance.item;

public class Stock {
    String nama;
    int jumlah;

    public Stock(String nama, int jumlah){
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public void use(){
        System.out.println("MC mengambil " + nama + "\n");
    }

    public void displayInfo(){
        System.out.println("== info barang ==");
        System.out.println("Nama Barang: " + nama + "| Jumlah: " + jumlah+ "\n");
    }
}
