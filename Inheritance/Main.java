package Inheritance;
import Inheritance.item.Stock;
import Inheritance.item.Makanan;
import Inheritance.item.ATK;

public class Main {
    public static void main(String[] args) {
        
        Stock buku1 = new ATK("Buku Tulis ", 2, "biru");
        Stock buku2 = new ATK("Buku cetak ", 2, "biru");
        Stock snack = new Makanan("Chitato", 5, "Asin");

    // Pemanggilan Method

        snack.displayInfo();
        buku1.displayInfo();

        buku1.use();
        buku2.use();
        snack.use();

        if (buku1 instanceof ATK){
            ((ATK) buku1).buang();
        }
        if (snack instanceof Makanan){
            ((Makanan) snack).restock();
        }

        snack.displayInfo();
        buku1.displayInfo();
    }
}
