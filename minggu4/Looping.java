package minggu4;

public class Looping {
    public static void main(String[] args) {
        System.out.println("Perulangan for:");

        for(int i = 1; i<=5; i++){
            System.out.println("Perulangan ke- : " + i);
        }
        System.out.println("-------------------------");

        System.out.println("Perulangan While:");
        int i = 1;

        while (i <= 5){
            System.out.println("perulangan ke- "+i);
            i++;
        }
        System.out.println("-------------------------");
        
        System.out.println("Perulangan Do While:");
        int j = 1;

        do {
            System.out.println("perulangan ke- "+j);
            j++;
        } while(j <= 5);
        System.out.println("-------------------------");
        int tabungan = 0;
        for(int bulan = 1; bulan <=6; bulan++){
            tabungan += 10000;
            System.out.println("Bulan ke-" +bulan + "\tTotal Tabungan=> RP" + tabungan);
        }
    }
}
