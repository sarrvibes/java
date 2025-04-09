package Inheritance.item;

public class Makanan extends Stock{
    private String rasa;

    public Makanan(String nama, int jumlah, String rasa){
        super(nama, jumlah);
        this.rasa = rasa;
    }

    @Override
    public void use(){
        System.out.println("MC Mengambil " + nama +" dari persediaan Makanan\n");
    }

    public void restock(){
        jumlah += 5;
        System.out.println("MC telah menambah persedian => " + nama + "|" + jumlah + "\n");
    }

    @Override
    public void displayInfo(){
        System.out.println("== Info Barang ==");
        System.out.println("Nama Makanan: " + nama + "| Jumlah: " + jumlah + "| Rasa: " + rasa + "\n");
    }
}
