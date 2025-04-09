package tugas2;

class StringDemo {
    public static void main(String args[]) {
        String nama = "Amin";
        System.out.println("nama: " + nama);
        System.out.println("Karakter ketiga dari nama: " + nama.charAt(2));

        /* karakter yang pertama nampak secara berurutan
           mempunyai nilai unicode lebih kecil */
        System.out.println("Amin dibanding dengan Sulaiman: " + nama.compareTo("Sulaiman"));
        System.out.println("Sulaiman dibanding dengan Amin: " + "Sulaiman".compareTo("Amin"));

        /* 'J' mempunyai nilai unicode yang lebih kecil dibanding 'j' */
        System.out.println("Amin dibanding dengan amin: " + nama.compareTo("amin"));
        System.out.println("Amin dibanding dengan amin (ignorecase): " + nama.compareToIgnoreCase("amin"));

        System.out.println("Apakah Amin sama dengan amin? " + nama.equals("amin")); //dibagian ini harusnya amin a kecil
        System.out.println("Apakah Amin sama dengan Amin? " + nama.equals("Amin"));
        System.out.println("Apakah Amin sama dengan amin (ignorecase)? " + nama.equalsIgnoreCase("amin"));

        char charArr[] = "Hi XX".toCharArray();
        
        /* Membutuhkan tambahan 1 untuk indeks endSrc dari getChars */
        "Amin".getChars(0, 2, charArr, 3);
        
        System.out.print("getChars method: ");
        System.out.println(charArr);
        
        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Ganti 'A' dengan 'e' nama: " + nama.replace('A', 'e')); //ga berubah karena java case sensitive

        /* Membutuhkan tambahan 1 untuk parameter endIndex dari substring */
        System.out.println("Substring dari nama: " + nama.substring(0, 2));
        System.out.println("Trim \" a b c d e f \": \"" + " a b c d e f ".trim() + "\"");

        System.out.println("String representasi dari ekspresi 10>10: " + String.valueOf(10 > 10));

        /* method toString secara implisit dipanggil method println */
        System.out.println("String representasi dari boolean expression 10<10: " + (10 < 10));

        /* Catatan, tidak ada perubahan pada nama objek String meskipun setelah penggunaan semua method. */
        System.out.println("nama: " + nama);
    }
}
