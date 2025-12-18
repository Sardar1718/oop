public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alihan", 19, 3.6);
        Student s2 = new Student("Nazar", 20, 3.9);

        Teacher t1 = new Teacher("Mr. Magzhan", "Mathematics", 10);
        Teacher t2 = new Teacher("Ms. Nurbek", "Economics", 7);

        Institution inst = new Institution("AITU University", "Astana");

        s1.displayInfo();
        s2.displayInfo();

        t1.displayInfo();
        t2.displayInfo();

        inst.displayInfo();

        if (s1.getGpa() > s2.getGpa()) {
            System.out.println(s1.getName() + " has higher GPA");
        } else {
            System.out.println(s2.getName() + " has higher GPA");
        }
    }
}