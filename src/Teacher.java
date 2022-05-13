import java.util.Random;

public class Teacher {
    public void gradeStudents(Student[] students, int count){
        Random random=new Random();

        for (int i = 0; i < count; i++) {
            students[i].grade1= random.nextDouble()*50+50.0;
            students[i].grade2= random.nextDouble()*50+50.0;
            students[i].grade3= random.nextDouble()*50+50.0;
        }
    }
}
