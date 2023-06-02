package designpatterns.prototype;

public class Sparrow extends  Bird {
    private  String legSize;

    public void setLegSize(String legSize) {
        this.legSize = legSize;
    }

    public Sparrow(Sparrow old) {
        super(old);
        this.legSize = old.legSize;
    }

    public  Sparrow() {}

    @Override
    public Sparrow clone() {
        return new Sparrow(this);
    }

}
