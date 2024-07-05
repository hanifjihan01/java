
import java.util.*;

public class Day03{


 

    public static void main(String[] args){


    //    int temp = 0;
    //     int result = 0;
    //     for (int i=0; i<=10 ; i++){
    //         if(temp == 0 || temp % 2 == 0){
    //             System.out.println(temp + " " +"adalah bilangan genap");
    //         }
    //         temp++;
    //     }


    // int temp = 500;
    //     int result = 0;
    //     for (int i=0; i<=4 ; i++){
          
    //             System.out.println(temp + " " +"adalah bilangan kelipatan 5");
            
    //         temp = temp + 5;
    //     }

    // int temp = 2000;
        
    //     for (int i=0; i<=24 ; i++){
    //         if(temp % 400 != 0 && temp % 100 != 0 && temp % 4 != 0 ){
    //             System.out.println(temp + " " +"adalah tahun kabisat");
    //         }
            
    //         temp++;
    //     }


// for(int i = 1 ; i<=10 ; i+=2){

//     System.out.println(i + "+" + (i+1) + "=" + (i+(i+1)));
// }
        

        
//  int n = 4; 
//         int nFaktorial = 1;

//         for (int i = 1; i <= n; i++) {
//             nFaktorial *= i; 
//         }

//         System.out.println("Faktorial dari " + n + " = " + nFaktorial);

         int n = 4;
        int result = totalFactorial(n);
        System.out.println("Faktorial dari " + n + " = " + result);
  

            
    }
      public static int totalFactorial(int n) {
        int nFaktorial = 1;
        for (int i = 1; i <= n; i++) {
            nFaktorial *= i;
        }
        return nFaktorial;
    }

}