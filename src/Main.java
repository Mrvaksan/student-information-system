import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isimler[] = new String[5];
        String soyisimler[] = new String[5];
        int numaralar[] = new int[5];
        double not1[] = new double[5];
        double not2[] = new double[5];
        double not3[] = new double[5];
        double ort[] = new double[5];
        String odul[] = new String[5];

        for (int i=0;i<5;i++) {
            System.out.println("Ogrenci Bilgilerini Giriniz.");
            System.out.print("Ogrencinin Ismi: ");
            isimler[i] = scan.next();

            if(isimler[i].equals("SON")){
                System.out.println("Baska Ogrenci Giremezsiniz!");
                break;
            }

            System.out.print("Ogrencinin Soyismi: ");
            soyisimler[i] = scan.next();
            System.out.print("Ogrencinin Okul Numarasi: ");
            numaralar[i] = scan.nextInt();
            System.out.print("Ogrencinin 1. Notu: ");
            not1[i] = scan.nextDouble();
            System.out.print("Ogrencinin 2.Notu: ");
            not2[i] = scan.nextDouble();
            System.out.print("Ogrencinin 3. Notu: ");
            not3[i] = scan.nextDouble();

            ort[i] = ((not1[i] + not2[i] + not3[i]) / 3);

            if(ort[i] >= 90) {
                odul[i] = "iPhone";
            } else if (ort[i] >= 80) {
                odul[i] = "iWatch";
            } else if (ort[i] >= 70) {
                odul[i] = "AirPods";
            }
            else {
                odul[i] = "-";
            }
        }

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","ISIM","SOYISIM","OGRENCI NO","NOT 1","NOT 2","NOT 3","ORTALAMA","ODUL");

        for (int i=0;i<5;i++) {
            if (isimler[i].equals("SON")) {
                break;
            }

            System.out.printf("%-15s%-15s%-15d%-15.2f%-15.2f%-15.2f%-15.2f%-15s\n", isimler[i], soyisimler[i], numaralar[i], not1[i], not2[i], not3[i], ort[i], odul[i]);
        }
    }
}
