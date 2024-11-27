
public class Rectangle extends Shape {

    private int length;
    private int width;
    private int height;

// constructor default//
    public Rectangle(String n, String y, int o, int k, int p) {

        super(n, y);
        this.length = o;
        this.width = k;
        this.height = p;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int value) {
        this.length = value;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    
    public int getHeight() {
      return this.height;
    }
    public void setHeight(int value) {
      this.height = value;
    }
    public void print() {
      System.out.println("length =" + this.length);
      System.out.println("Width =" + this.width);
      System.out.println("height = "+this.height);
  }

}
