import java.util.*;


public class lembarHalaman {
    


    public static void main(String[] args) {

        Scanner input;

        

        

    

        int totalHalaman;
        int lembar;
       int halaman;

        

         input = new Scanner(System.in);

         System.out.println("masukkan nilai totalHalaman");
         totalHalaman = input.nextInt();
         System.out.println("masukkan nilai halaman");
         lembar= input.nextInt();
         

        if(totalHalaman % 2 == 0){       
        halaman = (totalHalaman/(lembar))+1;
        }else{
            halaman = (totalHalaman/(lembar))+2;
        }

        System.out.println("lembar " + halaman);

    }
}
