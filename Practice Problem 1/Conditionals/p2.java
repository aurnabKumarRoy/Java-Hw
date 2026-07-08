import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer number: ");
        int num=scanner.nextInt();

        if(num%2==0){
            System.out.print("The number is Even");
        }
        else {
            System.out.print("The number is Odd");
        }
    }
}