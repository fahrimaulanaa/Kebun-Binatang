import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hewan apa yang ingin ditampilkan datanya?");
        System.out.println("1:Singa \t2:Monyet \t3:Jerapah \t4:Ikan   \t5:Cheetah");
        System.out.println("Masukkan kode angka: ");
        int pilihan = sc.nextInt();

        switch (pilihan){
            case 1:
                Singa.makan();
                Singa.suaranya();
                Singa.umurnya();
                break;
            case 2:
                Monyet.makanan();
                Monyet.suara();
                Monyet.umur();
                break;
            case 3:
                Jerapah.makanan();
                Jerapah.suara();
                Jerapah.umur();
                break;
            case 4:
                Ikan.makanan();
                Ikan.suara();
                Ikan.umur();
                break;
            case 5:
                Cheetah.makanan();
                Cheetah.suara();
                Cheetah.umur();
                break;
            default:
                System.out.println("Parameter tidak valid");
        }
    }
}
