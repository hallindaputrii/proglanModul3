public class Main {
    public static void main(String[] args) {
        int pulsaAwal = getPulsaAwal();
        int durasiPanggilan = getDurasiPanggilan();
        int biayaPerDetik = getBiayaPerDetik();

        int sisaPulsa = getSisaPulsa(pulsaAwal, durasiPanggilan, biayaPerDetik);
        System.out.println("Sisa pulsa: Rp" + sisaPulsa);
    }

    private static int getSisaPulsa(int pulsaAwal, int durasiPanggilan, int biayaPerDetik) {
        int sisaPulsa = hitungSisaPulsa(pulsaAwal, durasiPanggilan, biayaPerDetik);
        return sisaPulsa;
    }

    private static int getBiayaPerDetik() {
        int biayaPerDetik = 100;  // dalam Rupiah
        return biayaPerDetik;
    }

    private static int getDurasiPanggilan() {
        int durasiPanggilan = 60;  // dalam detik
        return durasiPanggilan;
    }

    private static int getPulsaAwal() {
        int pulsaAwal = 10000;  // dalam Rupiah
        return pulsaAwal;
    }

    public static int hitungSisaPulsa(int pulsaAwal, int durasiPanggilan, int biayaPerDetik) {
        return extracted(pulsaAwal, durasiPanggilan, biayaPerDetik);
    }

    private static int extracted(int pulsaAwal, int durasiPanggilan, int biayaPerDetik) {
        return pulsaAwal - (durasiPanggilan * biayaPerDetik);
    }
}