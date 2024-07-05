import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        double angkaKomputer;
        int angkaAnda;

        
        angkaKomputer = Math.random() * 10;
        
        angkaKomputer = (int) angkaKomputer;

        System.out.print("Masukkan angka anda (0-9): \n ");
        angkaAnda = inputUser.nextInt();
        System.out.println("Angka pilihan anda adalah " + angkaAnda);

        
        if (angkaKomputer > angkaAnda) {
            System.out.println("Angka anda lebih kecil dari komputer dan anda kalah!");
        } else if (angkaKomputer < angkaAnda) {
            System.out.println("Angka anda lebih besar dari komputer dan anda menang!");
        } else {
            System.out.println("Angka anda sama dengan komputer, ini seri!");
        }

        
        System.out.println("Angka komputer adalah: " + angkaKomputer);
    }
}
