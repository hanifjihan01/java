
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

    
        String nama = "Saya makan kemaren malam di";
        
       
        String[] katas = nama.split(" ");
        
        
        Map<Integer, List<String>> panjangKata = new TreeMap<>();
        
       
        for (String kata : katas) {
            int panjang = kata.length();
            panjangKata.putIfAbsent(panjang, new ArrayList<>());
            panjangKata.get(panjang).add(kata);
        }
        
    
        StringBuilder hasil = new StringBuilder();
        for (List<String> wordList : panjangKata.values()) {
            for (String kata : wordList) {
                hasil.append(kata).append(" ");
            }
        }
        
       
        System.out.println(hasil.toString().trim());
    }
}


