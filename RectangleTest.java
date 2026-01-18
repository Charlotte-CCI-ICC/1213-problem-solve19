import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();

        Rectangle box1 = new Rectangle(10, 10, width, height);
        System.out.println("box1: " + box1);
    }
}
