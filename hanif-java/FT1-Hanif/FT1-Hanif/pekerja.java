public class pekerja {
   
   
   
public static int pekerjaanWajib(int hari, int pekerja){


    int wajib = hari * pekerja;

    return wajib;

}

public static int pekerjaanSelesai(int hari, int pekerja){


    int selesai = hari * pekerja;

    return selesai;

}


public static int pekerjaanSisa(int pekerjaanWajib, int pekerjaanSelesai){


    int sisa = pekerjaanWajib - pekerjaanSelesai;

    return sisa;

}


public static int waktuTotal(int hari, int hari15, int hari19){


    int tersisa = hari - hari15 - hari19;

    return tersisa;

}

public static float pekerjaanMulus(int pekerjaanSisa, int waktuTotal, int jmlTarget){


    int terpenuhi = pekerjaanSisa/waktuTotal - jmlTarget;

    return terpenuhi;

}
   
    public static void main(String[] args){

       System.out.println(pekerjaanWajib(60, 20));
        System.out.println(pekerjaanSelesai(15, 20));
        System.out.println(pekerjaanSisa(pekerjaanWajib(60, 20), pekerjaanSelesai(15, 20) ));
        System.out.println(waktuTotal(60, 15, 9));
       System.out.println( pekerjaanMulus( pekerjaanSisa(pekerjaanWajib(60, 20), pekerjaanSelesai(15, 20)),waktuTotal(60, 15, 9), 20 ));;

    }
}
