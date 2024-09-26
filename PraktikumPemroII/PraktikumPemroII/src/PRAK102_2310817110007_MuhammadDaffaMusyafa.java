import java.util.Scanner;
public class PRAK102_2310817110007_MuhammadDaffaMusyafa {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = myNum.nextInt();
        int urutan = 0;
        while (urutan < 11) {
            if (angka % 5 == 0){
                System.out.print((angka / 5 -1) + " ");
            }else{
                System.out.print(angka + " ");
            }
            angka++;
            urutan++;
        }
    }
}
