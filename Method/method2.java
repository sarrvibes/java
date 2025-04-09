package Method;

public class method2 {
   int tambah(int a, int b){
    return a + b;
   }

   int kali(int a, int b){
    int hasilTambah = tambah(a, b);
    return hasilTambah * b;
   }

   public static void main(String[] args){
    method2 hitung = new method2();

    int hasil = hitung.tambah(5, 3);

    int hasilKali = hitung.kali(5, 4);

    System.out.println(hasil);
    System.out.println(hasilKali);
   }
}
