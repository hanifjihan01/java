public class Banget {
    public static String dayName(String input) {
        String dayName ;

        switch(input) {
            case "kemarin lusa":
                dayName = "Senin";
                break;
            case "kemarin":
                dayName = "Selasa";
                break;
            case "hari ini":
                dayName = "Rabu";
                break;
            case "besok":
                dayName = "Kamis";
                break;
            case "besok lusa":
                dayName = "Jumat";
                break;
            default:
                dayName = "Input tidak valid";
        }

        return dayName;
    }

        public static String Hari(int input) {
        String Hari ;

        switch(input) {
            case 1:
                Hari = "Senin";
                break;
            case 2:
                Hari = "Selasa";
                break;
            case 3:
                Hari = "Rabu";
                break;
            case 4:
                Hari = "Kamis";
                break;
            case 5:
                Hari = "Jumat";
                break;
            default:
                Hari = "Input tidak valid";
        }

        return Hari;
    }


    

    public static void main(String[] args) {
        System.out.println(dayName("kemarin lusa"));  
        System.out.println(Hari(1));
       
    }
}
