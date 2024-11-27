
public class Shape {

    private String name;
    private String color;

    //constructor//
    public Shape(String n, String y) {
        this.name = n;
        this.color = y;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public void print() {
        System.out.println("name = " + this.name);
        System.out.println("Color = " + this.color);
    }
}
