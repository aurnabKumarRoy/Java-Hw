import java.util.Scanner;

public class p1{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number: ");
        float num = scanner.nextFloat();

        if (num>0){
            System.out.print("The number is Positive");
        }
        else{
            System.out.print("The number is not Positive");
        }
    }
}