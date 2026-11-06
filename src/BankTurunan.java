public class BankTurunan {
    public static void main(String[] args) {
        Tabungan ani = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro budi = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        ani.cetakInfo();
        budi.cetakInfo();

        System.out.println();
        System.out.println("============ TRANSAKSI ============");
        System.out.printf("%-26s: %s%n", "Tabungan tarik 1.500.000", ani.tarik(1500000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro tarik 500.000", budi.tarik(500000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro tarik 300.000", budi.tarik(300000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Giro setor 100.000", budi.setor(100000) ? "Berhasil" : "Ditolak");
        System.out.printf("%-26s: %s%n", "Bunga tabungan", Rekening.formatRupiah(ani.tambahBunga()));

        System.out.println();
        System.out.println("========== REKENING AKHIR =========");
        ani.cetakInfo();
        budi.cetakInfo();
    }
}