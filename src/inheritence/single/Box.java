package inheritence.single;

public class Box{
   public int l;
   public int b;
   public int h;

    public Box(int l,int b,int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;

    }

    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }

    public Box()
    {
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

}
