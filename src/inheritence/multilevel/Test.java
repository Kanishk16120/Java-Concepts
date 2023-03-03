package inheritence.multilevel;

public class Test {
    public static void main(String[] args) {
        BoxPrice bp=new BoxPrice();
        String s="kkk";
        System.out.println(s.getClass().getClassLoader());
        System.out.println(Test.class.getClassLoader());
        Class c1=bp.getClass();
        System.out.println(c1.getName());
        System.out.println(bp);
    }
}
