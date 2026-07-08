import java.util.Scanner;

public class p_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius =scanner.nextFloat();

        final float pi=3.1416f;

        float volume=(float)(pi* Math.pow(radius,2));

        System.out.print("The ares of the circle is: "+ volume);

    }
}
