import java.util.Scanner;

public class p_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the ball: ");
        float radius =scanner.nextFloat();

        final float pi=3.1416f;

        float volume=(float)((4f/3f)*pi*Math.pow(radius,3));

        System.out.print("The Volume of the ball is: "+ volume);

    }
}
