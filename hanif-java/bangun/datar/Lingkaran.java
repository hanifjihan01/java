package bangun.datar;



public class Lingkaran implements bangunDatar {
    
    private float radius;
    
    public Lingkaran(float radius) {
        this.radius = radius;
    }

    @Override
    public float hitungLuas() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float hitungKeliling() {
        return (float) (2 * Math.PI * radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
       
    }
}

