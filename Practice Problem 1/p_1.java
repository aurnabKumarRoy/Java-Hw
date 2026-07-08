import java.util.Scanner;

public class p_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Base of the triangle: ");
        float base =scanner.nextFloat();

        System.out.print("Enter Height of the triangle: ");
        float height =scanner.nextFloat();

        float area= 0.5f *base*height;

        System.out.print("The area of the Triangle is: "+ area);

    }
}
