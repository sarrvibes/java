package Inheritance.item;

public class ATK extends Stock {
    private String warna;

    public ATK(String nama, int jumlah, String warna){
        super(nama, jumlah);
        this.warna = warna;
    }

    @Override
    public void use(){
        System.out.println("MC mengambil " + nama + "berwarna " + warna+ "\n");
    }
    public void buang(){
        jumlah -=1;
        System.out.println("MC telah membuang 1 item => " + nama + "|" + jumlah+ "\n");
    }
    
}
