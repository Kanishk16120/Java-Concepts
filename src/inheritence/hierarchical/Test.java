package inheritence.hierarchical;


import com.sun.org.apache.xpath.internal.operations.And;

class Developer{
    void say1(){
        System.out.println("Developer");
    }
}
class Web extends Developer{
    void say(){
        System.out.println("Web Developer");
    }
    void sayy2(){
        System.out.println("I am say2 inside Web");
    }
}
class Android extends Developer{
    void say(){
        System.out.println("Android Developer");
    }
}
 public class Test {
    public static void main(String[] args) {
        Web w1=new Web();
        Android a1=new Android();
        w1.say1();
        w1.say();
        a1.say1();
        a1.say();

    }
}
