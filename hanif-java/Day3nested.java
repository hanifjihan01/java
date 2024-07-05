
import java.util.Scanner;
public class Day3nested {

public static void main(String[] args){

    // for(int i=0; i<3; i++){
    //     System.out.println("i : " + i);
    //     for(int j=0; j<3; j++){
    //          System.out.println("j [ " +j+ "]");
    //     }
    //      System.out.println();
    // }




    // Scanner scan = new Scanner(System.in);
    // int n;
    // System.out.print("Masukkan n : ");
    // n = scan.nextInt();
      
    //     for (int i = 0; i < n; i++) {
         
    //         for (int j = 0; j < n; j++) {
               
    //             if (i == j) {
    //                 System.out.print(0);
    //             } else if (j > i) {
    //                 System.out.print(1);
    //             } else {
    //                 System.out.print(2);
    //             }

               
    //         }
            
    //         System.out.println();
    //     }


    // Scanner scan = new Scanner(System.in);
    // int n;
    // System.out.print("Masukkan n : ");
    // n = scan.nextInt();

    // for (int i = 0; i < n; i++) {

    //     for (int j = 0; j < n; j++) {

    //         if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }



    //     }

    //     System.out.println();
    // }



    // Scanner scanner = new Scanner(System.in);

    
    // System.out.print("Masukkan jumlah baris: ");
    // int rows = scanner.nextInt();

   
   
    // int startNumber = 17;

    
    // for (int i = 0; i < rows; i++) {
    
    //     for (int j = 0; j < rows; j++) {
    //         if (j == rows - 1) {
                
    //             System.out.print(startNumber);
    //         } else {
               
    //             System.out.print(startNumber + " ");
    //         }
    //         startNumber -= 2; 
    //     }
    //     System.out.println(); 
    // }

    // for (int i = 0; i < rows; i++) {
    
    //     for (int j = 0; j < rows; j++) {
    //         if (j == rows - 1) {
                
    //             System.out.print(startNumber);
    //         } else {
               
    //             System.out.print(startNumber + " ");
    //         }
    //         startNumber -= 2; 
    //     }
    //     System.out.println(); 
    // }

    // Scanner scanner = new Scanner(System.in);

    // System.out.print("Masukkan jumlah baris: ");
    // int rows = scanner.nextInt();

    // int ganjil = 1;  
    // int genap = 2; 
    // int startNumber = 7; 

    // for (int i = 0; i < rows; i++) {
    //     for (int j = 0; j < rows; j++) {
    //         if (i == 2) { 
    //             if (j == rows - 1) {
    //                 System.out.print(startNumber);
    //             } else {
    //                 System.out.print(startNumber + " ");
    //             }
    //             startNumber += 2;
    //         } else {
    //             if (i % 2 == 0) { 
    //                 if (j == rows - 1) {
    //                     System.out.print(ganjil);
    //                 } else {
    //                     System.out.print(ganjil + " ");
    //                 }
    //                 ganjil += 2;
    //             } else { 
    //                 if (j == rows - 1) {
    //                     System.out.print(genap);
    //                 } else {
    //                     System.out.print(genap + " ");
    //                 }
    //                 genap += 2;
    //             }
    //         }
    //     }
    //     System.out.println(); 
    // }


    int hasil = 0;
    int a = 100;

    while (a <= 500) {
        hasil += a;
        a += 100; 
    }

    System.out.println("hasilnya adalah " + hasil);
}


        }




