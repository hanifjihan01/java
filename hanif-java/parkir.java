

public class parkir {

    public static void main(String[] args) {
        

      
        int masukTanggal = 18;
        int masukBulan = 04;
        int masukTahun = 2024;
        int masukJam = 20;
        int masukMenit = 15;
        int masukDetik = 2;
        System.out.println("Masuk tanggal  " + masukTanggal+ "  bulan " + masukBulan+ " Tahun " + masukTahun+" jam "+masukJam + " Menit " + masukMenit + " detik " + masukDetik);

        int keluarTanggal = 18;
        int keluarBulan = 04;
        int keluarTahun = 2024;
        int keluarJam = 21;
        int keluarMenit = 20;
        int keluarDetik = 20;
        System.out.println("Masuk tanggal  " + keluarTanggal+ "  bulan " + keluarBulan+ " Tahun " + keluarTahun + "jam "+ keluarJam + " Menit " + keluarMenit +" detik "+keluarDetik );


        
        int detikMasuk = konversiKeDetik(masukTanggal, masukBulan, masukTahun, masukJam, masukMenit, masukDetik);
        int detikKeluar = konversiKeDetik(keluarTanggal, keluarBulan, keluarTahun, keluarJam, keluarMenit, keluarDetik);

        
        int selisihDetik = detikKeluar - detikMasuk;

      
        int selisihJam = (int) Math.ceil(selisihDetik / 3600.0);

        
        int tarif = hitungTarif(selisihJam);

        System.out.println("Tarif parkir adalah: " + tarif + " rupiah");
    }

    private static int konversiKeDetik(int tanggal, int bulan, int tahun, int jam, int menit, int detik) {
       
        return (((tahun * 365 + bulan * 30 + tanggal) * 24 + jam) * 60 + menit) * 60 + detik;
    }

    private static int hitungTarif(int selisihJam) {
        if (selisihJam <= 8) {
            return selisihJam * 1000;
        } else if (selisihJam <= 24) {
            return 8000;
        } else {
            int hariPenuh = selisihJam / 24;
            int sisaJam = selisihJam % 24;
            int tarif = hariPenuh * 15000;
            if (sisaJam <= 8) {
                tarif += sisaJam * 1000;
            } else {
                tarif += 8000;
            }
            return tarif;
        }
    }
}
