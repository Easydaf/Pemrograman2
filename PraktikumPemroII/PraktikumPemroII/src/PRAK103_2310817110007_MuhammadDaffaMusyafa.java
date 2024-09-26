import java.util.Scanner;
public class PRAK103_2310817110007_MuhammadDaffaMusyafa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int angkaKedua = scanner.nextInt();
        int baris = 0;
        if (angkaKedua % 2 == 0){
            angkaKedua++;
        }
        do {
            if (baris < n -1){
                System.out.print(angkaKedua + ", ");
                angkaKedua = angkaKedua + 2;
                baris++;
        }else{
            System.out.print(angkaKedua);
            break;
        }
        }while (baris < n);
    }
}
