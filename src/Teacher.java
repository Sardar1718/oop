import java.util.Objects;

public class Teacher extends Person {
    private String subject;
    private int experienceYears;

    public Teacher(String name, int age, String subject, int experienceYears) {
        super(name, age);
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    public String getSubject() {
        return subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public void info() {
        System.out.println(
                "Teacher: " + getName() +
                        ", Subject: " + subject +
                        ", Experience: " + experienceYears + " years"
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher t = (Teacher) o;
        return Objects.equals(getName(), t.getName()) &&
                Objects.equals(subject, t.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), subject);
    }
}
