import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2310817110007_MuhammadDaffaMusyafa {
    public static void main(String[] args) {
        double PHI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        float jariJari = scanner.nextFloat();
        System.out.print("Masukkan tinggi tabung: ");
        float tinggiTabung = scanner.nextFloat();
        double volumeTabung = PHI * jariJari * jariJari * tinggiTabung;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Volume tabung dengan jari jari " + jariJari + " cm " + "dan tinggi " + tinggiTabung + " cm "
                + "adalah " + df.format(volumeTabung) + " m3");
    }
}