import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Nazar", 18, "S01", 3.5));
        people.add(new Student("Danial", 18, "S02", 2.9));

        people.add(new Teacher("Miss Aigerim", 30, "OOP", 7));
        people.add(new Teacher("Mr Magzhan", 38, "Computer Science", 12));


        System.out.println("INFO:");
        for (Person p : people) {
            p.info();
        }



        System.out.println("\nStudents with GPA > 3.0:");
        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.getGpa() > 3.0) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("\nSearch Student S02:");
        for (Person p : people) {
            if (p instanceof Student) {
                Student s = (Student) p;
                if (s.getid().equals("S02")) {
                    System.out.println("Found: " + s);
                }
            }
        }

        ArrayList<Student> students = new ArrayList<>();
        for (Person p : people) {
            if (p instanceof Student) students.add((Student) p);
        }

        students.sort(Comparator.comparing(Student::getGpa).reversed());

        System.out.println("\nStudents sorted by GPA:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
