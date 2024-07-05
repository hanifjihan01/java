
import java.util.*;
public class Hanif {

    public static void main(String[] args){


        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan nilainya");
       n = inputUser.nextInt();
        // System.out.println(tambah(3, 3));

        // System.out.println(  fibonancy(10));
    // }

    // private static int tambah(int x, int y){
    //     int hitung = x + y;
    //     return hitung;
    // }
    
    // private static int fibonancy(int x){


    //     if( x  == 0){
    //         return x;
    //     }
        

    //     else{

    //         System.out.println(x);

            

    //     }

    //    return fibonancy(x-1);


    // }

   f_n_2 = 0;
   f_n_1 = 1;
   f_n = 1 ; 

  for(int i = 1; i <= n; i++){
    
    System.out.println("nilai ke - " + i + " adalah " + f_n);
    f_n = f_n_1 + f_n_2;
    f_n_2 = f_n_1;
    f_n_1 = f_n;
}

}

}
