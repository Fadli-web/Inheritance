
import java.util.Scanner;

public class TesterMain {

    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);
        System.out.println("SELAMAT DATANG");
        System.out.println("masukkan apakah ingin circle atau rectangle ?");
        String pilihan = f.nextLine();

        if (pilihan.equalsIgnoreCase("rectangle")) {
            System.out.println("apakah ingin cube atau rectangle?");
            String pilihan2 = f.nextLine();
            if (pilihan2.equals("cube")) {
                
                System.out.println("nama =");
                String name = f.nextLine();
                System.out.println("color = ");
                String color = f.nextLine();
                System.out.println("length = ");
                int length = f.nextInt();
                System.out.println("width = ");
                int width = f.nextInt();
                System.out.println("height = ");
                int height = f.nextInt();
                f.nextLine();
                Cube j = new Cube(name, name, width);
                j.print();
                int penjumlahan = length*width*height;
                System.out.println("total input =\n"+penjumlahan);

            }

            if (pilihan2.equals("rectangle")) {

                System.out.println();
                System.out.println("nama =");
                String nama = f.nextLine();
                System.out.println("color = ");
                String color = f.nextLine();
                System.out.println("length = ");
                int length = f.nextInt();
                System.out.println("width = ");
                int width = f.nextInt();
                
                int rumus = length *width;
                Rectangle k = new Rectangle(nama, color, width, length, width);
                k.print();
                System.out.println("total inputan =\n"+rumus);
                f.close();
                

            }
        } else if (pilihan.equalsIgnoreCase("circle")) {

            double panjang = 3.14;
            System.out.println("nama = ");
            String name = f.nextLine();
            System.out.println("color = ");
            String color = f.nextLine();
            System.out.println("radius = ");
            int radius = f.nextInt();
             f.nextLine();
            Circle circle = new Circle(name, color, radius);
            circle.print();
            System.out.println("total input = (radius x panjang pi)" + radius * radius * panjang);

        }

    }
}
