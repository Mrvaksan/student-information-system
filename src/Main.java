import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] students = new Student[5];
        Teacher teacher=new Teacher();
        int studentCount=0;

        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            studentCount++;

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
        }

        //Teacher will grade students here
        teacher.gradeStudents(students, studentCount);

        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ISIM", "SOYISIM", "OGRENCI NO", "NOT 1", "NOT 2", "NOT 3", "ORTALAMA", "ODUL");

        for (int i = 0; i < 5; i++) {
            if (students[i].name.equals("SON")) {
                break;
            }
            students[i].printInfo();
        }
    }
}