package bangun.datar;

public class persegi extends bangunDatarAbstrak {

    public persegi(float sisi) {
        super(sisi);
    }

    @Override
    public float hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public float hitungKeliling() {
        return 4 * sisi;
    }

    public static void main(String[] args) {
    
    }
}
