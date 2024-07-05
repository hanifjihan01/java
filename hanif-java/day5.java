public class day5 {

    public static void main(String[] args) {
       
        String huruf = "abcdzzz";
        int[] angka = {1, 2, 2, 4, 4, 26, 26};

        
        boolean[] results = cekHurufAngka(huruf, angka);

        
        for (boolean result : results) {
            System.out.println(result);
        }
    }

    public static boolean[] cekHurufAngka(String input, int[] weights) {
        
        boolean[] results = new boolean[input.length()];

        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            
            if (c >= 'a' && c <= 'z') {
                
                int weight = c - 'a' + 1;
                
                results[i] = (weight == weights[i]);
            } else {
                
                results[i] = false;
            }
        }

        return results;



    //     int a = 1;
    //     int result = 0;
    // for(int i= 1; i<=10; i++){

       
    //     result += a;
    //     System.out.println("Ini adalah a dan result, a= "+ " "+"result="+" "+result+" "+i);
    //     a++;
       
    // }


    }

  
    
}
