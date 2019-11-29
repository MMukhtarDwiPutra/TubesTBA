package tba;

import java.util.ArrayList;

public class kalimat {
    ArrayList<String> subjek = new ArrayList<>();
    ArrayList<String> kata = new ArrayList<>();
    ArrayList<String> obyek = new ArrayList<>();
    ArrayList<String> predikat = new ArrayList<>();
    ArrayList<String> keterangan = new ArrayList<>();
    
    public void tambahObyek(){
        obyek.add("ikan");
        obyek.add("kucing");
        obyek.add("anjing");
        obyek.add("sendok");
        obyek.add("piring");
    }
    
    public void tambahPredikat(){
        predikat.add("dikejar");
        predikat.add("memancing");
        predikat.add("memakai");
        predikat.add("menyukai");
        predikat.add("memecahkan");
    }
    
    public void tambahSubjek(){
        subjek.add("Aku");
        subjek.add("Kamu");
        subjek.add("Gery");
        subjek.add("Putra");
        subjek.add("Kami");
    }
    
    public void tambahKeterangan(){
        keterangan.add("dengan pancing.");
        keterangan.add("di depan rumah.");
        keterangan.add("liar.");
        keterangan.add("ke warung.");
        keterangan.add("yang dibeli.");
    }
}
