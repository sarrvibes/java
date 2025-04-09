package Method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// BufferedReader berfungsi untuk membaca teks dari file, keyboard, atau jaringan dengan lebih cepat dan efisien
// IOException berfungsi  exception (pengecualian) dalam Java yang berfungsi untuk menangani kesalahan dalam operasi input/output (I/O), seperti:Gagal membaca atau menulis file, File tidak ditemukan, Koneksi jaringan gagal, Kesalahan saat menggunakan stream (InputStream/OutputStream)
// InputStream berfungsi untuk membaca data biner (byte stream) dari file, keyboard, atau jaringan
// Arraylist berfungsi struktur data dinamis yang digunakan untuk menyimpan kumpulan objek seperti array, tetapi ukurannya bisa berubah secara otomatis

public class daftarBuku {
    static ArrayList<String> daftarBuku = new ArrayList<>(); //tampung data
    static boolean isRunning = true; //menandakan program ini masih berjalan
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in); //membaca keyword
    static BufferedReader input = new BufferedReader(inputStreamReader); 

    static void menu() throws IOException{
        System.out.println("====================================");
        System.out.println("[1] Tampilin semua buku");
        System.out.println("[2] Tambah buku");
        System.out.println("[3] Edit buku");
        System.out.println("[4] Hapus buku");
        System.out.println("[5]Keluar");
        System.out.println("Pilih menu:");

        int menuDipilih = Integer.parseInt(input.readLine());

        switch (menuDipilih) {
            case 1:
                showAllBooks();

                break;

            case 2:
            addBook();
            break;

            case 3:
            editBook();
                break;

            case 4: 
            deleteBook();
            break;

            case 5:
            System.out.println("Program selesai");
            System.exit(0);
            default:
            System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    static void showAllBooks(){
        // isEmpty untuk mengecak yang kosong
        if (daftarBuku.isEmpty()) {
            System.out.println("belum ada data");
            
        }else{
            System.out.println("======================");
            for(int i = 0; i < daftarBuku.size(); i++){
                System.out.println(String.format("[%d] %s", i, daftarBuku.get(i)));
            }
        }
    }

    static void addBook() throws IOException{
        System.out.println("Masukkan Judul buku: ");
        String judulBuku = input.readLine();
        daftarBuku.add(judulBuku);
        System.out.println("Buku berhasil ditambah");
    }

    static void editBook() throws IOException{
        showAllBooks();

        if(daftarBuku.isEmpty()){
            return;
        }

        System.out.println("Pilih nomor buku");
        int indexBuku = Integer.parseInt(input.readLine());
        
        if (indexBuku < 0 || indexBuku >= daftarBuku.size()) {
            System.out.println("Nomor buku tidak valid");
        }

        System.out.println("Masukkan judul buku baru: ");
        String judulBaru = input.readLine();
        daftarBuku.set(indexBuku, judulBaru);
        System.out.println("Buku berhasil di edit");
    }

    static void deleteBook() throws IOException{
        showAllBooks();

        if (daftarBuku.isEmpty()) {
            return;
        }

        System.out.println("Pilih nomor buku yang mau dihapus");
        int indexBuku = Integer.parseInt(input.readLine());

        if(indexBuku < 0 || indexBuku >= daftarBuku.size()){
            System.out.println("nomor buku tidak valid!");
            return;
        }

        daftarBuku.remove(indexBuku);
        System.out.println("Buku berhasil dihapus!");
    }

    public static void main(String[] args) throws IOException{
        while (isRunning) {
            menu();
        }
    }
}
