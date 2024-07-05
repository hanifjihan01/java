import java.util.Scanner;


public class Day4 {



    

    // public static int[] totalArray(int[] arrayA, int[] arrayB) {
    //     int[] arrayC = new int[arrayA.length];
    //     for (int i = 0; i < arrayA.length; i++) {
    //         arrayC[i] = arrayA[i] + arrayB[i];
    //     }
    //     return arrayC;
    // }


    public static int maxTriple(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        int middle = nums[nums.length / 2];

        if (first >= last && first >= middle) {
            return first;
        } else if (last >= first && last >= middle) {
            return last;
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {




        int arrK [][] = {
            {1,2,3}, {4,5,6,7}, {8,9,10}
            
        };

        for(int i=0; i<arrK.length; i++){
            for(int j=0; j<arrK.length; j++){
                System.out.print(arrK[i][j]  + " ");
            }
            System.out.println();
        }



     
    //     S canner scanner = new Scanner(System.in);

    //     System.out.print("Masukkan panjang array: ");
    //     int length = scanner.nextInt();

    //     int[] ArrayA = new int[length];
    //     int[] ArrayB = new int[length];

    //     System.out.println("Masukkan ArrayA:");
    //     for (int i = 0; i < length; i++) {
    //         System.out.print("Elemen ke-" + (i + 1) + ": ");
    //         ArrayA[i] = scanner.nextInt();
    //     }

    //     System.out.println("Masukkan ArrayB:");
    //     for (int i = 0; i < length; i++) {
    //         System.out.print("Elemen ke" + (i + 1) + ": ");
    //         ArrayB[i] = scanner.nextInt();
    //     }

    //     int[] ArrayC = totalArray(ArrayA, ArrayB);

    //     System.out.print("ArrayC: ");
    //     for (int i = 0; i < ArrayC.length; i++) {
    //         System.out.print(ArrayC[i] + " ");
    //     }

      
    //     int sum = 0;
    //     for (int i = 0; i < ArrayC.length; i++) {
    //         sum += ArrayC[i];
    //     }
    //     float average = (float) sum / ArrayC.length;
    //     System.out.println("\nRata-rata ArrayC: " + average);

       
    //     int max = ArrayC[0];
    //     for (int i = 1; i < ArrayC.length; i++) {
    //         if (ArrayC[i] > max) {
    //             max = ArrayC[i];
    //         }
    //     }
    //     System.out.println("Nilai maksimum ArrayC: " + max);

     
    //     int min = ArrayC[0];
    //     for (int i = 1; i < ArrayC.length; i++) {
    //         if (ArrayC[i] < min) {
    //             min = ArrayC[i];
    //         }
    //     }
    //     System.out.println("Nilai minimum ArrayC: " + min);


    //     float median;
    //     if (ArrayC.length % 2 == 0) {
    //         median = (float) (ArrayC[ArrayC.length / 2] + ArrayC[ArrayC.length / 2 - 1]) / 2;
    //     } else {
    //         median = ArrayC[(ArrayC.length - 1) / 2];
    //     }
    //     System.out.println("Nilai tengah median ArrayC: " + median);
        
        

    //     scanner.close();





        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 5, 3};
        int[] arr3 = {1, 6, 2};
        int[] arr4 = {1, 2, 3, 1, 1};
        int[] arr5 = {1, 7, 3, 1, 5};
        int[] arr6 = {5, 1, 3, 7, 1};
        int[] arr7 = {5, 5, 7, 8, 1, 9, 7};

        System.out.println(maxTriple(arr1));  
        System.out.println(maxTriple(arr2));  
        System.out.println(maxTriple(arr3));  
        System.out.println(maxTriple(arr4));  
        System.out.println(maxTriple(arr5));  
        System.out.println(maxTriple(arr6));  
        System.out.println(maxTriple(arr7));  
    }

}
