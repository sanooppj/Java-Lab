import java.util.Scanner;

class AreaCalculator {
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double base, double height) {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }

    void area(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class Area_of_shapes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter side of square: ");
        int s = sc.nextInt();
        
        System.out.print("Enter length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        AreaCalculator areaObj = new AreaCalculator();
        areaObj.area(s);
        areaObj.area(l, b);
        areaObj.area(base, height);
        areaObj.area(r);

        sc.close();
    }
}
