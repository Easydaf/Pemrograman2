import java.util.Scanner;
public class PRAK104_2310817110007_MuhammadDaffaMusyafa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tangan Abu: ");
        String tanganAbu = scanner.nextLine();
        System.out.println("Tangan Bagas: ");
        String tanganBagas = scanner.nextLine();
        int menangAbu = 0;
        int menangBagas = 0;
        int i=0;

        while (i <= tanganAbu.length()){
            if (tanganAbu.charAt(i) == 'B' && tanganBagas.charAt(i) == 'G'||
                tanganAbu.charAt(i) == 'G' && tanganBagas.charAt(i) == 'K' ||
                tanganAbu.charAt(i) == 'K' && tanganBagas.charAt(i) == 'B'){
                menangAbu++;
                }else if (tanganAbu.charAt(i) == 'G' && tanganBagas.charAt(i) == 'B' ||
                tanganAbu.charAt(i) == 'K' && tanganBagas.charAt(i) == 'G' ||
                tanganAbu.charAt(i) == 'B' && tanganBagas.charAt(i) == 'K'){
                menangBagas++;
                }
                i += 2;
        }
        if (menangAbu > menangBagas){
            System.out.println("Abu Menang");
        }else if (menangAbu < menangBagas){
            System.out.println("Bagas Menang");
        }else{
            System.out.println("Seri");
        }
    }
}