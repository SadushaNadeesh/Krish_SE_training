public class Student {
    int id;
    Cource cource;
    String student;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }

    @Override
    public String toString() {
        student = cource.getCource()+" "+id;
        return student;
    }
    
    
}
