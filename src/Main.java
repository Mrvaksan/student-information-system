import java.util.Scanner;

public class Main {
    static double calculateAverage(double grade1, double grade2, double grade3) {
        return (grade1 + grade2 + grade3) / 3;
    }

    static String getReward(double ort) {
        if (ort >= 90) {
            return "iPHONE";
        } else if (ort >= 80) {
            return "iWatch";
        } else if (ort >= 70) {
            return "AirPods";
        } else {
            return "-";
        }
    }

    static void printStudentInfo(String name, String surname, int id, double grade1, double grade2, double grade3) {
        System.out.printf("%-15s%-15s%-15d%-15.2f%-15.2f%-15.2f%-15.2f%-15s\n", name, surname, id, grade1, grade2, grade3, calculateAverage(grade1, grade2, grade3), getReward(calculateAverage(grade1, grade2, grade3)));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = new String[5];
        String surnames[] = new String[5];
        int id[] = new int[5];
        double grade1[] = new double[5];
        double grade2[] = new double[5];
        double grade3[] = new double[5];
        double average[] = new double[5];
        String reward[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ogrenci Bilgilerini Giriniz.");
            System.out.print("Ogrencinin Ismi: ");
            names[i] = scan.next();

            if (names[i].equals("SON")) {
                System.out.println("Baska Ogrenci Giremezsiniz!");
                break;
            }

            System.out.print("Ogrencinin Soyismi: ");
            surnames[i] = scan.next();
            System.out.print("Ogrencinin Okul Numarasi: ");
            id[i] = scan.nextInt();
            System.out.print("Ogrencinin 1. Notu: ");
            grade1[i] = scan.nextDouble();
            System.out.print("Ogrencinin 2. Notu: ");
            grade2[i] = scan.nextDouble();
            System.out.print("Ogrencinin 3. Notu: ");
            grade3[i] = scan.nextDouble();

            average[i] = calculateAverage(grade1[i], grade2[i], grade3[i]);
            reward[i] = getReward(average[i]);

        }
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "ISIM", "SOYISIM", "OGRENCI NO", "NOT 1", "NOT 2", "NOT 3", "ORTALAMA", "ODUL");

        for (int i = 0; i < 5; i++) {
            if (names[i].equals("SON")) {
                break;
            }
            printStudentInfo(names[i], surnames[i], id[i], grade1[i], grade2[i], grade3[i]);
        }
    }
}