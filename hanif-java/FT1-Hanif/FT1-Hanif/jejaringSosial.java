import java.util.Arrays;
import java.util.Scanner;

public class jejaringSosial {

    public static void main(String[] args) {
        
        int[][] a = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan operasi ( +, -, x):");
        String input = scanner.nextLine();
        
        System.out.println("Pilihlah di antara tiga keyword berikut: tambah, kurang, kali:");
        String input3 = scanner.nextLine();

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                switch(input3) {
                    case "tambah":
                        a[i][j] += Integer.parseInt(input);
                        break;
                    case "kurang":
                        a[i][j] -= Integer.parseInt(input);
                        break;
                    case "kali":
                        a[i][j] *= Integer.parseInt(input);
                        break;
                    default:
                        System.out.println("Operasi tidak dikenali.");
                        break;
                }
            }
        }

        System.out.println("Array setelah operasi:");
        for(int[] row : a) {
            System.out.println(Arrays.toString(row));
        }
        
        scanner.close();
    }
}
