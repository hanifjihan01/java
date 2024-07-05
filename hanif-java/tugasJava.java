import java.util.Scanner;

public class tugasJava {
    
    private static double saldo = 0.0;
    private static final String correctPin = "123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan PIN: ");
        String inputPin = scanner.nextLine();

        if (!inputPin.equals(correctPin)) {
            System.out.println("Maaf, PIN salah.");
            return;
        }

        System.out.print("Uang yang disetor: ");
        double setorTunai = scanner.nextDouble();
        saldo += setorTunai;
        System.out.println("Setor tunai berhasil. Saldo anda saat ini: Rp." + saldo);

        System.out.println("Pilihan transfer: 1. Antar rekening, 2. Antar bank");
        int pilihanTransfer = scanner.nextInt();

        switch (pilihanTransfer) {
            case 1:
                transferAntarRekening(scanner);
                break;
            case 2:
                transferAntarBank(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    private static void transferAntarRekening(Scanner scanner) {
        System.out.print("Masukkan rekening tujuan (10 digit): ");
        String rekeningTujuan = scanner.next();

        if (rekeningTujuan.length() != 10) {
            System.out.println("Nomor rekening harus 10 digit.");
            return;
        }

        System.out.print("Masukkan nominal transfer: ");
        double nominalTransfer = scanner.nextDouble();

        if (nominalTransfer > saldo) {
            System.out.println("Saldo tidak cukup.");
            return;
        }

        saldo -= nominalTransfer;
        System.out.println("Transaksi berhasil. Saldo anda saat ini: Rp." + saldo);
    }

    private static void transferAntarBank(Scanner scanner) {
        System.out.print("Kode bank: ");
        String kodeBank = scanner.next();

        System.out.print("Masukkan rekening tujuan (10 digit): ");
        String rekeningTujuan = scanner.next();

        if (rekeningTujuan.length() != 10) {
            System.out.println("Nomor rekening harus 10 digit.");
            return;
        }

        System.out.print("Masukkan nominal transfer: ");
        double nominalTransfer = scanner.nextDouble();
        double biayaAdmin = 7500;

        if (nominalTransfer + biayaAdmin > saldo) {
            System.out.println("Saldo tidak cukup.");
            return;
        }

        saldo -= (nominalTransfer + biayaAdmin);
        System.out.println("Transaksi berhasil. Saldo anda saat ini: Rp." + saldo);
    }
}
