package less9.task1;

public class Stud {
    private
    int age, course;
    private String name;

    public static void main(String[] args) {
        Stud student = new Stud(23, 4, "Alice");
        Aspirant as = new Aspirant(24, 5, "Richard", "Lawyer");
        Stud[] students = new Stud[2];
        students[0] = student;
        students[1] = as;
        for (Stud s : students) {
            System.out.println(s.name + " = " + s.getScolarship());
        }
    }
    public Stud(int age, int course, String name) {
        this.age = age;
        this.course = course;
        this.name = name;
    }
    public int getScolarship() {
        return 100;
    }
}





