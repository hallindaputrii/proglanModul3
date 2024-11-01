class PulsaCalculator {
    public static void main(String[] args) {
        int pulsaAwal = 10000;  // dalam Rupiah
        int durasiPanggilan = 60;  // dalam detik
        int biayaPerDetik = 100;  // dalam Rupiah

        int sisaPulsa = hitungSisaPulsa(pulsaAwal, durasiPanggilan, biayaPerDetik);
        System.out.println("Sisa pulsa: Rp" + sisaPulsa);
    }

    public static int hitungSisaPulsa(int pulsaAwal, int durasiPanggilan, int biayaPerDetik) {
        return pulsaAwal - (durasiPanggilan * biayaPerDetik);
    }
}