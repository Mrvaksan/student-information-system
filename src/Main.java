import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();

            System.out.println("Ogrenci Bilgilerini Giriniz.");
            System.out.print("Ogrencinin Ismi: ");
            students[i].name = scan.next();

            if (students[i].name.equals("SON")) {
                System.out.println("Baska Ogrenci Giremezsiniz!");
                break;
            }

            System.out.print("Ogrencinin Soyismi: ");
            students[i].surname = scan.next();
            System.out.print("Ogrencinin Okul Numarasi: ");
            students[i].id = scan.nextInt();
            System.out.print("Ogrencinin 1. Notu: ");
            students[i].grade1 = scan.nextDouble();
            System.out.print("Ogrencinin 2. Notu: ");
            students[i].grade2 = scan.nextDouble();
            System.out.print("Ogrencinin 3. Notu: ");
            students[i].grade3 = scan.nextDouble();

        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ISIM", "SOYISIM", "OGRENCI NO", "NOT 1", "NOT 2", "NOT 3", "ORTALAMA", "ODUL");

        for (int i = 0; i < 5; i++) {
            if (students[i].name.equals("SON")) {
                break;
            }
            students[i].printInfo();
        }
    }
}