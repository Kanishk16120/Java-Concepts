package inheritence.multilevel;


import inheritence.single.Boxweight;

public class BoxPrice extends Boxweight {
    float price;
    BoxPrice()
    {
        super();
        this.price=0.0f;
    }
    BoxPrice(int l,int b,int h,float w,float price)
    {
        super(l,b,h,w);
        this.price=price;
    }
    BoxPrice(BoxPrice other)
    {
        this.l=other.l;
        this.b=other.b;
        this.h=other.h;
        this.w=other.w;
        this.price=other.price;
    }

    @Override
    public String toString() {
        return "BoxPrice{" +
                "price=" + price +
                ", w=" + w +
                ", l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
