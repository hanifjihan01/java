package bangun.datar;

public abstract class bangunDatarAbstrak implements bangunDatar {
    protected float sisi;

    public bangunDatarAbstrak(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public abstract float hitungLuas();

    @Override
    public abstract float hitungKeliling();
}
