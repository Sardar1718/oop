import java.util.Objects;
public class Student extends Person{
    private String id;
    private double gpa;

    public Student(String name, int age, String id, double gpa) {
        super(name,age);
        this.id = id;
        this.gpa = gpa;
    }
    public String getid() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void info() {
        System.out.println("Student: " + getName() + ", GPA: " + gpa);
    }

    @Override
    public String toString() {
        return "Student{name=" + getName() +
                ", age=" + getAge() +
                ", id=" + id +
                ", gpa=" + gpa + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return Objects.equals(id, s.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}