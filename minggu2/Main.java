public class Main {
    public static void buatGaris(int panjang, char simbol) {
        for (int i = 0; i < panjang; i++) {
            System.out.print(simbol);
        }
        System.out.println(); // Pindah ke baris baru
    }
    public static void main(String[] args) {
        int i = 5;
        int resultIncPre = ++i;
        int resultIncPost = i++;
        int j = 5;
        int resultDecPre = --j;
        int resultDecPost = j--;

        buatGaris(25, '-');
        System.out.println("i: " +i);
        System.out.println("result inc prefix: " +resultIncPre);
        System.out.println("result inc postfix: " +resultIncPost);

        buatGaris(25, '-');
        System.out.println("j: " +j);
        System.out.println("result dec prefix: " +resultDecPre);
        System.out.println("result dec postfix: " +resultDecPost);
        buatGaris(25, '-');
    }
}
