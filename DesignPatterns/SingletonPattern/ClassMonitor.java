package SingletonPattern;

/**
 * Created by Sadusha on 1/18/2021.
 */
public class ClassMonitor {
    public static void main(String[] args) {
        long start,end;

        Student student = Student.getStudent();
        System.out.println(student.getSchool()+" Student memory location : "+student);

        start=System.currentTimeMillis();
        String school = student.getSchool();
        end=System.currentTimeMillis();
        System.out.println(end-start);

        Student student1 = Student.getStudent();
        System.out.println(student1.getSchool()+" Student1 memory location : "+student1);

        start=System.currentTimeMillis();
        String school1 = student.getSchool();
        end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
