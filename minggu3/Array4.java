import java.util.*;

public class Array4 {
    public static void main(String[] args){
    int num[] = {50,20,45,82,25,63};
    int l = num.length;
    int i;
    System.out.print("Bilangan yang diberikan ");
    
    for (i=0; i<l; i++){
    System.out.print(" "+ num[i]);
}
    System.out.println("\n");
    System.out.print("Urutan bilangan dari kecil ke besar :");
    
    //sort : library untuk menyortir 
    Arrays.sort(num);
    
    for (i=0; i<l; i++){
    System.out.print(" "+ num[i]);
    }
  }
}