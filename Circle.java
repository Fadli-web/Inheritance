public class Circle extends Shape{
    private int radius;

    public Circle(String n, String y, int o) {
        super(n, y);
        this.radius = o;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int value) {
        this.radius = value;
    }

    public void print() {
        System.out.println("radius = " + this.radius);
    }
}
