import java.util.Scanner;

public class p_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temp in Celcius: ");
        float celcius =scanner.nextFloat();

        float fahrenheit=(float)(celcius *9f/5f)+32;


        System.out.print(celcius +" degree celcius = "+ fahrenheit+" degree fahrenheit");

    }
}
