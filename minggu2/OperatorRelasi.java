public class OperatorRelasi {
    public static void main(String[] args) {
        int nilai1 = 40;
        int nilai2 = 30;
    
        if (nilai1 > nilai2) {
            System.out.println("nilai 1 tidak sama dengan nilai 2");
            
        }else{
            System.out.println("nilai 1 dan 2 tidak sama");
        }
    
     int umur = 20;
            boolean punyaktp = true;
    
            if (umur >= 18 && punyaktp) {
                System.out.println("boleh masuk");
            }else{
                System.out.println("ga boleh masuk");
            }
    
            boolean harilibur = true;
            boolean harikerja = false;
    
            if(harilibur || harikerja){
                System.out.println("kerja");
            }else{
                System.out.println("tidur");
            }

    }
}
