public class Array2D {
    public static void main(String[] args) {
        int [][] arr2 = new int [4] [5];
        for (int i = 0; i < arr2.length; i++){
            for(int j=0; j < arr2.length;j++){
                arr2[i][j] = i;
                System.out.print(" " + arr2[i][j]);
            }
            System.out.println(" ");
        }
        // int [][] a2 = new int [6][3];

        // for (int i=0; i <a2.length; i++){
        //     for (int j=0; j <a2[i].length; j++){
        //         a2[i][j] = i;
        //         System.out.print(" " + a2[i][j]);
        //     }
        //     System.out.println(" ");
        // }
        
    }
}