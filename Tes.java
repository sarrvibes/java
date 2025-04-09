import java.util.Scanner;

public class Tes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // System.out.print("MAsukkan Angka: ");
        // int N = input.nextInt();

        // // System.out.println();

        // System.out.print("angka ganjil: ");
        // for(int i = 1; i < N; i += 2){
        //     System.out.print(i + " ");
        // }
        // System.out.print("angka genap: ");
        // for(int i = 2; i < N; i += 2){
        //     System.out.print(i + " ");
        // }
        // input.close();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.println(nama);
        System.out.println(umur + " tahun");

        input.close();

        
    }
    
}
