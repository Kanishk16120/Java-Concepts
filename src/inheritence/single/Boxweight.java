package inheritence.single;



import inheritence.single.Box;

public class Boxweight extends Box
{
   public float w;

    public Boxweight()
    {
        super();
        this.w=10.5f;
    }

    public Boxweight(int l,int b,int h,float w)
    {
        super(l,b,h);
        this.w=w;
    }

    @Override
    public String toString() {
        return "Boxweight{" +
                "w=" + w +
                ", l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}

