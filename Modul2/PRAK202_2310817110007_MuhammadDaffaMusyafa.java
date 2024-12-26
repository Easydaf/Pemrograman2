package Modul2;

public class PRAK202_2310817110007_MuhammadDaffaMusyafa {
    static class soal2main{
        String namaKopi;
        String ukuran;
        double harga;
    
            double pajakKopi(){
            return harga * 0.11;
        }
    
        String infoKopi(){
            return "Nama Kopi: " + namaKopi + "\nUkuran: " + ukuran + "\nHarga: Rp" + harga + "\nPajak: Rp" + pajakKopi();
        }
    }
    public static void main(String[] args) {
        soal2main kopi1 = new soal2main();
        kopi1.namaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.harga = 25000.0;
    
        System.out.println(kopi1.infoKopi());
    }
}
