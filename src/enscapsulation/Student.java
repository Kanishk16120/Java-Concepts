package enscapsulation;

public class Student {
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        if(marks>=0.0f) {
        this.marks = marks;}
        else {
            this.marks=0;
        }
    }

    private float marks;

    public Student() {
        this.marks=33.3f;
        this.roll=72;
        this.name="Vicky";
    }

    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
}
