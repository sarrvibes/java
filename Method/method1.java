package Method;

public class method1 {
    public static void sapa(){
        System.out.println("halo");
    }

    public static int tambah(int a, int b){
        int var = 5;
        int var2 = 7;

        int hitung = var + var2;
        System.out.println(hitung);
        return hitung;
    }

        // method 
    public static int tambah(int a, int b, int c){
        return a + b + c;
    }


    //method faktorial
    public static int faktorial(int n){
        if(n == 1){
            return 1;
        }
        return n * faktorial(n - 1);
    }

    public void halo(){
        System.out.println("halo");
    }

    public static void main(String[] args){
        sapa();
        System.out.println(tambah(1, 4));
        System.out.println(faktorial(5));
    }
}
