package Modul2;

public class PRAK203_2310817110007_MuhammadDaffaMusyafa {
    // karena di main menggunakan Pegawai, maka harus menggunakan Pegawai
    // static class Employee {}
    static class Pegawai {
        String nama;
        // tidak bisa menggunakan char karena asal bisa lebih dari 1 karakter, harus
        // menggunakan String
    // char asal;
        String asal;
        String jabatan;
        int umur;
    
    String getNama() {
            return nama;
        }
    
        String getAsal() {
            return asal;
        }
    
    // kurang parameter
    /*
         * void setJabatan() {
         * this.jabatan = j;
         * }
         */
        void setJabatan(String j) {
            this.jabatan = j;
        }
    }

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        // tidak ada umur, tolong perhatikan lagi kodenya
        p1.umur = 17;
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
