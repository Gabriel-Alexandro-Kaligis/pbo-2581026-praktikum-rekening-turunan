public class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo += jumlah;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    public void cetakInfo() {
        System.out.printf("%s | %-6s | %12s%n", nomor, pemilik, formatRupiah(saldo));
    }

    protected static String formatRupiah(int jumlah) {
        String angka = String.valueOf(Math.abs(jumlah));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < angka.length(); i++) {
            if (i > 0 && (angka.length() - i) % 3 == 0) {
                sb.append('.');
            }
            sb.append(angka.charAt(i));
        }
        return "Rp" + (jumlah < 0 ? "-" : "") + sb;
    }
}