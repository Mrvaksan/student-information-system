public class Student {
    String name = new String();
    String surname = new String();
    int id;
    double grade1;
    double grade2;
    double grade3;

    public double Average() {
        return (this.grade1 + this.grade2 + this.grade3) / 3;
    }

    public String Odul() {
        if (Average() >= 90) {
            return "iPHONE";
        } else if (Average() >= 80) {
            return "iWatch";
        } else if (Average() >= 70) {
            return "AirPods";
        } else {
            return "-";
        }
    }

    public void printInfo() {
        System.out.printf("%-15s%-15s%-15d%-15.2f%-15.2f%-15.2f%-15.2f%-15s\n", name, surname, id, grade1, grade2, grade3, Average(), Odul());
    }
}
