package minggu5;

public class Kucing {
    //Membuat object di sebut Instansiasi 
    //Atribut atau properti
    String nama;
    String ras;
    int umur;

    //Construcktor (Pondasi awalnya)
    public Kucing(String nama, String ras,int umur){
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
    }

    //methodnya (bagian program yang berisi serangkaian instruksi atau kode yang dapat dipanggil untuk dijalankan)
    void tampilkaninfo(){
        System.out.println("nama :" + nama);
        System.out.println("ras :" + ras);
        System.out.println("umur :" + umur);
    }
}
