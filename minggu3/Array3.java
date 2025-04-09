public class Array3 {
    public static void main(String[] args){
        double[] nilai = {85.5, 90.0, 75.5, 88.7};

        double total = 0;

        //forech loop variabel : array masukin nilai array ke variabel
        for(double n : nilai){
            total += n;
        }
        double rataRata = total / nilai.length;
        System.out.println("Rata rata nilai ujian : " + rataRata);
    }
}