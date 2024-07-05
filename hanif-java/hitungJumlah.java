

public class hitungJumlah {

    public static void main(String[] args) {
        int[] n = {4, 1, 3};
        int jumlah = 0;
        String kosong = "";

        for (int i = 0; i < n.length; i++) {
            if (i == 0) {
                kosong += n[i];
            } else {
                kosong += " + " + n[i];
            }

            jumlah += n[i];
            if (i == 0) {
                System.out.println(kosong);
            } else {
                System.out.println(kosong + " = " + jumlah);
            }
        }
    }
}
