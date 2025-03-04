package pholimorpysm;

public class Main {
    public static void main(String[] args) {
        PholimorpysmBangunDatar[] daftarBangunDatar = {
            new Persegi(8),
            new Lingkaran(14),
            new Segitiga(7, 8)
        };

        for (PholimorpysmBangunDatar bangun : daftarBangunDatar) {
            System.out.println("Luas: " + bangun.luas());
            System.out.println("Keliling: " + bangun.keliling());
            System.out.println("-------------------");
        }
    }
}

