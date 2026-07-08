import java.util.Scanner;

public class p_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 arms of a triangle triangle: ");
        float a =scanner.nextFloat();
        float b =scanner.nextFloat();
        float c =scanner.nextFloat();

        float s=(float)((a+b+c)/2f);

        float area=(float)(Math.sqrt(s * (s-a) * (s-b) * (s-c)));

        System.out.print("The area of the  triangle is: "+area);
    }
}
