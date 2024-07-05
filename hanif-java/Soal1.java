public class Soal1{

public static  void kelamin(String nama, String jk){

    if(jk == "Laki"){
        System.out.println("pria" +" "+ nama);

    } else {

        System.out.println("Wanita" +" "+ nama);
    }
}

public static  void orang(int tahun_lahir, String nama){

    if(tahun_lahir >= 1944 && tahun_lahir <=1964){
        System.out.println(nama +" "+tahun_lahir+ " " +"Gen z");

    } else if(tahun_lahir >= 1965 && tahun_lahir <=1979){
        System.out.println(nama +" "+tahun_lahir+ " " +"Gen x");

    }else if(tahun_lahir >= 1995 && tahun_lahir <=2024){
        System.out.println(nama +" "+tahun_lahir+ " " +"Gen z");

    }
    
    else {

        System.out.println("Salah bro yang lu masukin");
    }
}


public static void orang2(float tinggi_badan, float berat_badan) {
 
    float bmi = berat_badan / (tinggi_badan * tinggi_badan);

    
    if (bmi <= 18.5) {
        System.out.println("Kurus");
    } else if (bmi > 18.5 && bmi <= 25) {
        System.out.println("Ideal");
    } else if (bmi > 25) {
        System.out.println("Gemuk");
    } else {
        System.out.println("Salah bro yang lu masukin");
    }
}

  public static String hitungNilai(int score) {
        if (score > 100 || score < 0) {
            return "Invalid";
        } else if (score < 50) {
            return "E";
        } else if (score < 60) {
            return "D";
        } else if (score < 76) {
            return "C";
        } else if (score < 90) {
            return "B";
        } else {
            return "A";
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
        System.out.println(a*a + b*b);
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
}


    public static void main(String[] args){
      

      kelamin("Ucok","Laki");
      orang(1998, "Hanif");
      orang2(170,50);
      System.out.println(hitungNilai(70));
      intMax(1,2,3);
      intMax(1,3,2);
      intMax(3,2,1);
      sumDouble(2,2);
      monkeyTrouble(false, false);
      in3050(30,40);
    }

