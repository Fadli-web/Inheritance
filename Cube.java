
public class Cube extends Rectangle {

    private int height;

    //constructor default//
    public Cube(String n, String y, int h) {
        super(n, y, h, h,h);
        this.height = h;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int value) {
        this.height = value;
    }

    public void print() {
        System.out.println("height= " + this.height);
    }
}
