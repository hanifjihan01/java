public class Tugas222{


  public static void in3050(int a, int b) {
        if ( a >= 30 && a <= 40 && b >= 30 && b <= 40){
            System.out.println(true);
        }
        else if( a >= 40 && a <= 50 && b >= 40 && b <= 50){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
    }


    public static void intMax(int a, int b, int c) {
    if (a > b && a > c) {
        System.out.println(a);
    } else if (b > a && b > c) {
        System.out.println(b);
    } else {
        System.out.println(c);
    }
}

public static void sumDouble(int a, int b) {
    if (a == b ) {
        System.out.println((a+b)*2);
    } else {
        System.out.println(a+b);
    }
}

public static void monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile ) {
        System.out.println(true);
    } else {
        System.out.println(false);
    }
}





    public static void main(String[] args){
       intMax(1,2,3);
      intMax(1,3,2);
      intMax(3,2,1);
      sumDouble(2,2);
      monkeyTrouble(false, false);
      in3050(30,40);
    }
}
