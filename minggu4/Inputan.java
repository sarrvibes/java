package minggu4;
import java.util.Scanner;

public class Inputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pinBenar = 1234;
        int pinUser;
        int kesempatan = 3;
    
        do{
            System.out.println("Masukkan Pin ATM: ");
            pinUser = input.nextInt();
            kesempatan--;

            if (pinUser == pinBenar){
                System.out.println("pin benar Akses diberikan!");
                break;
            }else if (kesempatan > 0){
                System.out.println("Pin salah! Kesempatan bersisa " + kesempatan);
            }else{
                System.out.println("Akses diblokir!");
            }

        } while (kesempatan > 0);
        input.close(); 
    }
    
}
