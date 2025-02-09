import java.util.Scanner;

class VolumeCalculator {
    void volume(int side) {
        System.out.println("Volume of Cube: " + (side * side * side));
    }

    void volume(int length, int breadth, int height) {
        System.out.println("Volume of Cuboid: " + (length * breadth * height));
    }

    void volume(double radius) {
        System.out.println("Volume of Sphere: " + ((4.0 / 3.0) * Math.PI * radius * radius * radius));
    }

    void volume(double radius, double height) {
        System.out.println("Volume of Cylinder: " + (Math.PI * radius * radius * height));
    }

    void volume(int radius, double height) {
        System.out.println("Volume of Cone: " + ((1.0 / 3.0) * Math.PI * radius * radius * height));
    }
}

public class Volume_of_shapes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        int cubeSide = sc.nextInt();

        System.out.print("Enter length, breadth, and height of cuboid: ");
        int cuboidLength = sc.nextInt();
        int cuboidBreadth = sc.nextInt();
        int cuboidHeight = sc.nextInt();

        System.out.print("Enter radius of sphere: ");
        double sphereRadius = sc.nextDouble();

        System.out.print("Enter radius and height of cylinder: ");
        double cylRadius = sc.nextDouble();
        double cylHeight = sc.nextDouble();

        System.out.print("Enter radius and height of cone: ");
        int coneRadius = sc.nextInt();
        double coneHeight = sc.nextDouble();

        VolumeCalculator volumeObj = new VolumeCalculator();
        volumeObj.volume(cubeSide);
        volumeObj.volume(cuboidLength, cuboidBreadth, cuboidHeight);
        volumeObj.volume(sphereRadius);
        volumeObj.volume(cylRadius, cylHeight);
        volumeObj.volume(coneRadius, coneHeight);

        sc.close();
    }
}
