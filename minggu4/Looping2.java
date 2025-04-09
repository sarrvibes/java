package minggu4;

public class Looping2 {
    public static void main(String[] args) {
        int kapasitasEmber = 5;
        int airDalamEmber = 0;

        System.out.println("mengisi air ke dalam ember: ");
        while (airDalamEmber < kapasitasEmber) {
            airDalamEmber++;
            System.out.println("Menambah 1 liter air => Total: " +airDalamEmber + " liter");
        }
        System.out.println("ember sudah penuh");
    }
}
