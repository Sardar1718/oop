import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ====== OLD PART (Collections & OOP) ======
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Nazar", 18, "S01", 3.5));
        people.add(new Student("Danial", 18, "S02", 2.9));
        people.add(new Teacher("Miss Aigerim", 30, "OOP", 7));

        for (Person p : people) {
            p.info();
        }

        // ====== DATABASE PART ======
        StudentDAO studentDAO = new StudentDAO();

        studentDAO.addStudent(new Student("Nazar", 18, "S01", 3.5));
        studentDAO.addStudent(new Student("Danial", 18, "S02", 2.9));

        System.out.println("\nFrom database:");
        studentDAO.readStudents();

        studentDAO.updateGpa("S02", 3.3);
        studentDAO.deleteStudent("S01");

        System.out.println("\nAfter update & delete:");
        studentDAO.readStudents();
    }
}

