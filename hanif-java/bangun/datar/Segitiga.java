package bangun.datar;

public class Segitiga extends bangunDatarAbstrak {
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        super(alas);
        this.tinggi = tinggi;
    }

    @Override
    public float hitungLuas() {
        return 0.5f * sisi * tinggi;
    }

    @Override
    public float hitungKeliling() {
        
        return 3 * sisi;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return sisi;
    }

    public void setAlas(float alas) {
        this.sisi = alas;
    }

    public static void main(String[] args) {
       
    }
}
