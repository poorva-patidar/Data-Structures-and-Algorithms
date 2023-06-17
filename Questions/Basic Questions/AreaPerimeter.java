import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = in.nextInt();

        float area = (float) (Math.PI * radius * radius);
        float perimeter = (float) (2 * Math.PI * radius);

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);

    }
}
