package pholimorpysm;

public abstract class PholimorpysmBangunDatar {
    public abstract double luas();
    public abstract double keliling();
}

    class Persegi extends PholimorpysmBangunDatar {
        private double sisi;

        public Persegi(double sisi) {
            this.sisi = sisi;
        }

        @Override
        public double luas() {
            return sisi * sisi;
        }

        @Override
        public double keliling() {
            return 4 * sisi;
        }
    }

    class Lingkaran extends PholimorpysmBangunDatar {
        private double r;

        public Lingkaran(double r) {
            this.r = r;
        }

        @Override
        public double luas() {
            return Math.PI * r * r;
        }

        @Override
        public double keliling() {
            return 2 * Math.PI * r;
        }
    }

    class Segitiga extends PholimorpysmBangunDatar {
        private double alas;
        private double tinggi;

        public Segitiga(double alas, double tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
        }

        @Override
        public double luas() {
            return (alas * tinggi) / 2;
        }

        @Override
        public double keliling() {
            double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
            return alas + tinggi + sisiMiring;
        }
    }
