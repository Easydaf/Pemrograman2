import java.util.Scanner;
public class PRAK101_2310817110007_MuhammadDaffaMusyafa {
    public static void main(String[] args) {
        Scanner myString = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap anda: ");
        String nama = myString.nextLine();
        System.out.print("Masukkan tempat lahir anda: ");
        String tempatLahir = myString.nextLine();
        System.out.print("Masukkan tanggal lahir anda: ");
        int tanggalLahir = myString.nextInt();
        System.out.print("Masukkan bulan lahir: ");
        int bulanLahir = myString.nextInt();
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = myString.nextInt();
        System.out.print("Masukkan tinggi badan anda: ");
        int tinggiBadan = myString.nextInt();
        System.out.print("Masukkan berat badan anda: ");
        float beratBadan = myString.nextFloat();


        String bulanLahirString = "";
        switch (bulanLahir) {
            case 1:
                bulanLahirString = "Januari";
                break;
            case 2:
                bulanLahirString = "Februari";
                break;
            case 3:
                bulanLahirString = "Maret";
                break;
            case 4:
                bulanLahirString = "April";
                break;
            case 5:
                bulanLahirString = "Mei";
                break;
            case 6:
                bulanLahirString = "Juni";
                break;
            case 7:
                bulanLahirString = "Juli";
                break;
            case 8:
                bulanLahirString = "Agustus";
                break;
            case 9:
                bulanLahirString = "September";
                break;
            case 10:
                bulanLahirString = "Oktober";
                break;
            case 11:
                bulanLahirString = "November";
                break;
            case 12:
                bulanLahirString = "Desember";
                break;
            default:
                break;
        }

        System.out.print("Nama lengkap " + nama + " lahir di " + tempatLahir + " Pada Tanggal " + tanggalLahir + " " + bulanLahirString + " " + tahunLahir + 
        " tinggi badan " + tinggiBadan + " cm dan berat badan " + beratBadan + " kilogram.");

    }
}