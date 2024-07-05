import java.util.Scanner;

public class belajar25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Masukkan jumlah laki-laki dewasa: ");
        int adultMen = scanner.nextInt();

        System.out.print("Masukkan jumlah perempuan dewasa: ");
        int adultWomen = scanner.nextInt();

        System.out.print("Masukkan jumlah remaja: ");
        int teenagers = scanner.nextInt();

        System.out.print("Masukkan jumlah anak-anak: ");
        int children = scanner.nextInt();

        System.out.print("Masukkan jumlah balita: ");
        int toddlers = scanner.nextInt();

    
        int totalPeople = adultMen + adultWomen + teenagers + children + toddlers;

        
        int totalPortions = (adultMen * 2) + (adultWomen * 1) + (teenagers * 1) + (children * 1/2) + (toddlers * 1);

        
        if (totalPeople > 5 && totalPeople % 2 != 0) {
            totalPortions += adultWomen; 
        }

        
        System.out.println("Total jumlah orang yang makan: " + totalPeople);
        System.out.println("Total porsi makanan yang dimakan: " + totalPortions);
    }
}
