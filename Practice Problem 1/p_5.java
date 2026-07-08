import java.util.Scanner;

public class p_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the arm of Equilateral triangle: ");
        float arm =scanner.nextFloat();

        float area=(float)((Math.sqrt(3f/4f)) * Math.pow(arm,2));


        System.out.print("The area of the Equilateral triangle is: "+area);

    }
}
