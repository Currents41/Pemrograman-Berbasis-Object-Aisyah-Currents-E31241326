package pholimorpysm;

public class Zoo {
    public static void main(String[] args) {
    PholiomorpysmHewan[] zoo= {
        new Kucing("Yoyo", 50),
        new Elang("Sky King", 2.3),
        new LumbaLumba("Bubbles", 70)
    };
        
    for(PholiomorpysmHewan hewan : zoo) {
        System.out.println("=== " + hewan.getNama() + " ===");
        hewan.Bersuara();
        hewan.Bergerak();
        System.out.println();
    }
    }
}


