import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        int heat;


        Scanner inp=new Scanner(System.in);
        System.out.println("Sıcaklık değeri giriniz  :");
        heat=inp.nextInt();

        if(heat <5){
            System.out.println("Kayak Yapabilirsiniz.");

        } else if (heat <= 25) {
            if (heat <=15){
                System.out.println("Sinemaya Gidebilirsiniz.");
            }
            if (heat >=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }

    }
}
