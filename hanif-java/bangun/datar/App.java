package bangun.datar;

public class App {
    public static void main(String[] args) {
        
        Lingkaran lingkaranBaru = new Lingkaran(3);
        System.out.println("Lingkaran:");
        System.out.println("Radius: " + lingkaranBaru.getRadius());
        System.out.println("Luas: " + lingkaranBaru.hitungLuas());
        System.out.println("Keliling: " + lingkaranBaru.hitungKeliling());

        System.out.println(); 

        
        Segitiga segitigaBaru = new Segitiga(3, 5);
        System.out.println("Segitiga:");
        System.out.println("Tinggi: " + segitigaBaru.getTinggi());
        System.out.println("Alas: " + segitigaBaru.getAlas());
        System.out.println("Luas: " + segitigaBaru.hitungLuas());
        System.out.println("Keliling: " + segitigaBaru.hitungKeliling());

        System.out.println(); 

        
        persegi persegiBaru = new persegi(4);
        System.out.println("Persegi:");
        System.out.println("Sisi: " + persegiBaru.getSisi());
        System.out.println("Luas: " + persegiBaru.hitungLuas());
        System.out.println("Keliling: " + persegiBaru.hitungKeliling());
    }
}
