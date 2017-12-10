package less9.task1;


public class Aspirant extends Stud {
    private String work;

    public Aspirant(int age, int course, String name, String work) {
        super(age, course, name);
        this.work = work;
    }
    @Override
    public int getScolarship() {
        return 200;
    }

}

