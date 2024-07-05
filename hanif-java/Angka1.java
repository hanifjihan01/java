public class Angka1 {
  
    
    // public static double perjalanan(double jarak) {
    //     return jarak / 2.5; 
    // }

    public static void jumlahGunungLembah(String perjalanan) {
        
        int posisiAwal = 0;
        int gunung = 0;
        int lembah = 0;

        for (int i = 0; i < perjalanan.length(); i++) {
            char rute = perjalanan.charAt(i);
            if (rute == 'N') {
                posisiAwal++;
            } else if (rute == 'T') {
                posisiAwal--;
            }

           
            if (posisiAwal == 0 && rute == 'N') {
                lembah++;
            }

            
            if (posisiAwal == 0 && rute == 'T') {
                gunung++;
            }
        }

        System.out.println("Gunung: " + gunung);
        System.out.println("Lembah: " + lembah);
    }
    public static void main(String[] args){

        
            String perjalanan = "NNTNNNTTTTTNTTTNTN";
            jumlahGunungLembah(perjalanan);
        
        

        // int max  = 100;
        // int tampung = 3;
        // int n = 3;

        // for(int i = 0; i < n; i++){     
            
        //     System.out.println(max + " \" Si Angka 1 \" ");
        //     max += tampung;
        //     tampung=tampung+3;

            
        // }


       
//        double[][] jaraks = {
//         {1.75, 0.25}, 
//         {0.25, 0.25}, 
//         {0.25, 1.25}, 
//         {1.25, 1.25}  
//     };

    

    
//     double tokoToTempat1 = jaraks[0][0] + jaraks[0][1];
//     double tempat1ToTempat2 = jaraks[1][0] + jaraks[1][1];
//     double tempat2ToTempat3 = jaraks[2][0] + jaraks[2][1];
//     double tempat3ToTempat4 = jaraks[3][0] + jaraks[3][1];
//     double tokoToTempat1toTempat2toToko = (jaraks[0][0]+jaraks[0][1]+jaraks[1][0]+jaraks[1][1])+(jaraks[1][1]+jaraks[1][0] + jaraks[0][1]+ jaraks[0][0]) ;

//    System.out.println(tokoToTempat1toTempat2toToko);
//     double tokoToTempat1ToTempat2 = tokoToTempat1 + tempat1ToTempat2;
//     double tempat2ToTempat1ToToko = tempat1ToTempat2 + tokoToTempat1;

   
//     double fuelForTokoToTempat1ToTempat2 = perjalanan(tokoToTempat1ToTempat2);
//     double fuelForTempat2ToTempat1ToToko = perjalanan(tempat2ToTempat1ToToko);
//     double fuelForTokoTempat1ToTempat2ToToko = perjalanan(tokoToTempat1toTempat2toToko);

  
//     System.out.println("Toko -> Tempat1 -> Tempat2: " + tokoToTempat1ToTempat2 + " km, Bensin: " + fuelForTokoToTempat1ToTempat2 + " liters");
//     System.out.println("Tempat2 -> Tempat1 -> Toko: " + tempat2ToTempat1ToToko + " km, Bensin: " + fuelForTempat2ToTempat1ToToko + " liters");
//     System.out.println("Toko -> Tempat1 -> Tempat2 -> Toko: " + tokoToTempat1toTempat2toToko + " km, Bensin: " + fuelForTokoTempat1ToTempat2ToToko + " liters");
        

       

    }
}
