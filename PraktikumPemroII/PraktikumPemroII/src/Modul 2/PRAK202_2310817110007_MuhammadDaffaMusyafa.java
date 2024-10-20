public class PRAK202_2310817110007_MuhammadDaffaMusyafa {
    static class coffeShop{
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
        coffeShop arabica = new coffeShop();
        arabica.namaKopi = "Espresso";
        arabica.ukuran = "Medium";
        arabica.harga = 25000.0;

        System.out.println(arabica.infoKopi());
    }
}
