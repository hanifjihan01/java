public class angkaKotak {
    

    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] b = {1,2,3,4,5,6,7,8,9};

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }

        // round 1
        if(a > b){
            System.out.println("anda menang");
        }else if(a < b){
            System.out.println("anda kalah");
        }else{
            System.out.println("draw");
        }
     

    }
}
