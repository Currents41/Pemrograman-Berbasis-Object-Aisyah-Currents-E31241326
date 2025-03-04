package pholimorpysm;

public abstract class PholiomorpysmHewan {
    private String nama;
    
    public PholiomorpysmHewan(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public abstract void Bersuara();
    public abstract void Bergerak();
}

    class Kucing extends PholiomorpysmHewan {
        private int tinggiLompat;

        public Kucing(String nama, int tinggiLompat) {
            super(nama);
            this.tinggiLompat = tinggiLompat;
        }

        @Override
        public void Bersuara() {
            System.out.println(getNama() + " Bersuara: Meow!");
        }

        @Override
        public void Bergerak() {
            System.out.println(getNama() + " melompat setinggi" + tinggiLompat + " cm");
        }
    }

    class Elang extends PholiomorpysmHewan {
        private double lebarSayap;

        public Elang(String nama, double lebarSayap) {
            super(nama);
            this.lebarSayap = lebarSayap;
        }

        @Override
        public void Bersuara() {
            System.out.println(getNama() + " bersuara: Cit!");
        }

        @Override
        public void Bergerak() {
            System.out.printf("%s meluncur dengan lebar sayap %.1f meter\n", getNama(), lebarSayap);
        }
    }

    class LumbaLumba extends PholiomorpysmHewan {
        private int kedalamanRenang;

        public LumbaLumba(String nama, int kedalamanRenang) {
            super(nama);
            this.kedalamanRenang = kedalamanRenang;
        }

        @Override
        public void Bersuara() {
            System.out.println(getNama() + " berkata: Eee-ee-ee!");
        }

        @Override
        public void Bergerak() {
            System.out.println(getNama() + " menyelam hingga " + kedalamanRenang + " meter");
        }
    }

