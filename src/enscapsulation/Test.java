package enscapsulation;

public class Test {
    static void say(){
        System.out.println("sayyyy!");

    }
    public static void main(String[] args) {

        Student s1=new Student();
        s1.setName("Kanishk");
        s1.setRoll(16);
        s1.setMarks(-1);
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
        System.out.println(s1);
        say();
    }
}
