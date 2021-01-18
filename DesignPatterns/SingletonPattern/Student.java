package SingletonPattern;

/**
 *
 * @author Sadusha
 */
public class Student {

    private static Student student;
    private String school;
    
    private Student() {
        if (student != null) {
            throw new RuntimeException("Please use getA method");
        }
    }

    public static Student getStudent() {
        if (student == null) {
            //Double checking Singleton
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }

    public String getSchool() {
        if(school==null){
            synchronized(Student.class){
                if(school==null){
                    school = "Mahinda College";
                }
            }
        }
        return school;
    }
}