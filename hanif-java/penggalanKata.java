import java.util.Arrays;

public class penggalanKata {
    public static void main(String[] args) {
        int n = 2;

        String[] penggalanKata = {"hallo"};
        String[] arrayBaru;

        
        if (penggalanKata.length >= 4) {
            arrayBaru = Arrays.copyOfRange(penggalanKata, 3, 4);
        } else {
            arrayBaru = new String[] {"tidak ada"};
        }

        System.out.println(Arrays.toString(arrayBaru));
    }
}
