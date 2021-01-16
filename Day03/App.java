public class App {
    public static void main(String[] args) {
        Student student;
        Cource cource;
        int id;
        student = new Student();
        cource = new Cource("Java");
        id = 10;
        student.setCource(cource);
        student.setId(10);
        System.out.println("Before "+ student);
        //changeStudent(student);
        //System.out.println("After "+ student);
        changeStudent2(student);
        System.out.println("After change2 "+ student);
          
    }
    private static void changeStudent(Student student2){
        Cource newCource = new Cource("Spring");
        student2.setId(20);
        student2.setCource(newCource);
    }
    
    private static void changeStudent2(Student student2){
        Student newStudent = new Student();
        Cource newCource = new Cource("Spring");
        newStudent.setId(20);
        newStudent.setCource(newCource);
        newStudent = student2;
    }
    
}
