package minggu5;

public class Main {
        public static void main(String[] args) {
            Kucing kucing1 = new Kucing("oyen", "persia", 2);
            Kucing kucing2 = new Kucing("putih", "munckin", 2);
    
            System.out.println("Kucing1" );
            kucing1.tampilkaninfo();
            System.out.println("Kucing2" );
            kucing2.tampilkaninfo();
            
        }
}
